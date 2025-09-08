from flask import Flask, request, jsonify
import pyodbc
from flask_cors import CORS

app = Flask(__name__)
# This allows the HTML file to make a request to the Python server
CORS(app) 

# Database connection details based on your screenshot
# The server name is your laptop name
SERVER = 'LAPTOP-TRR0U4GS'
# This is the name of the database you will create
DATABASE = 'DemographicsDB'

# Create a connection string using Windows Authentication
# Note: This requires the correct ODBC driver to be installed
CNXN_STR = (
    'DRIVER={ODBC Driver 17 for SQL Server};'
    f'SERVER={SERVER};'
    f'DATABASE={DATABASE};'
    'Trusted_Connection=yes;'
)

@app.route('/submit-demographics', methods=['POST'])
def submit_demographics():
    try:
        # Get the JSON data sent from the form
        data = request.get_json()
        
        # Connect to the database
        cnxn = pyodbc.connect(CNXN_STR)
        cursor = cnxn.cursor()

        # SQL INSERT statement to add a new row to the table
        sql_insert = """
        INSERT INTO Demographics (FullName, Age, Gender, City, Country)
        VALUES (?, ?, ?, ?, ?)
        """
        
        # Execute the query with the data from the form
        cursor.execute(sql_insert, 
                       data['name'], 
                       data['age'], 
                       data['gender'], 
                       data['city'], 
                       data['country'])
        
        # Commit the transaction to save the changes
        cnxn.commit()
        
        # Close the connection
        cursor.close()
        cnxn.close()

        # Return a success message as a JSON response
        return jsonify({"message": "Data saved successfully!"}), 200

    except Exception as e:
        # If an error occurs, print it and send an error response
        print(f"Error: {e}")
        return jsonify({"message": f"An error occurred: {e}"}), 500

if __name__ == '__main__':
    # Run the Flask application on port 5000
    app.run(host='127.0.0.1', port=5000)