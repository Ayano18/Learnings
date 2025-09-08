// --- REQUIRED SETUP ---
// 1. Install Node.js on your machine.
// 2. Open your terminal in the same folder as this file.
// 3. Run the following command to install the necessary libraries:
//    npm install express mssql body-parser cors
// 4. Update the SQL Server configuration in this file with your details.
// 5. Run the server using the command: node server.js

// --- IMPORTANT NOTE ON SECURITY ---
// This example uses a local database for a local setup. In a real-world application,
// you would never expose these credentials in a public-facing file.
// All database interaction should always be handled by a secure backend server.

const express = require('express');
const sql = require('mssql');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
const port = 3000;

// Enable JSON body parsing for incoming requests
app.use(bodyParser.json());

// Set up CORS (Cross-Origin Resource Sharing) to allow requests from the HTML file
app.use(cors());

// SQL Server connection configuration
const config = {
    // --- UPDATED FOR SQL SERVER AUTHENTICATION ---
    // Using the user and password you created in SSMS
    user: 'WebAccess', 
    password: 'hahahaha',
    server: 'LAPTOP-TRR0U4GS',
    database: 'Practices',
    options: {
        encrypt: false,
        trustServerCertificate: true
    }
};

// Define the API endpoint to handle form data
app.post('/submit-data', async (req, res) => {
    const { name, email } = req.body;

    if (!name || !email) {
        return res.status(400).json({ message: 'Name and email are required.' });
    }

    try {
        // Connect to the database
        await sql.connect(config);

        // Create a new request object
        const request = new sql.Request();

        // Use a parameterized query to prevent SQL Injection
        request.input('name', sql.NVarChar, name);
        request.input('email', sql.NVarChar, email);

        const query = 'INSERT INTO Users (Name, Email) VALUES (@name, @email)';

        // Execute the insert query
        await request.query(query);

        console.log(`Data for ${name} saved successfully.`);
        res.status(200).json({ message: 'Data saved to SSMS successfully!' });

    } catch (err) {
        console.error('Database error:', err);
        res.status(500).json({ message: 'Error saving data to the database.' });
    } finally {
        // Close the connection pool
        sql.close();
    }
});

// Start the server
app.listen(port, () => {
    console.log(`Server listening at http://localhost:${port}`);
});
