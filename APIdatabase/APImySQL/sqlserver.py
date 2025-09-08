from flask import Flask, request, jsonify
from flask_cors import CORS
import mysql.connector

# Replace with your MySQL database credentials.
# The host and user are based on your MySQL Workbench screenshot.
db_config = {
    'user': 'root', # User from MySQL Workbench
    'password': 'TimLouis2005', # Replace this with your actual root password
    'host': '127.0.0.1',
    'database': 'demographics'
}

# Initialize the Flask app
app = Flask(__name__)
# Enable CORS for your frontend application to communicate with the backend
CORS(app)

@app.route('/submit-demographics', methods=['POST'])
def submit_demographics():
    # Check if the request body is a valid JSON
    if not request.is_json:
        return jsonify({"error": "Request must be JSON"}), 400

    # Get the JSON data from the request
    data = request.get_json()

    # Validate that all required fields are present
    required_fields = ['name', 'age', 'gender', 'city', 'country']
    for field in required_fields:
        if field not in data:
            return jsonify({"error": f"Missing required field: {field}"}), 400

    # Extract data from the request
    name = data['name']
    age = data['age']
    gender = data['gender']
    city = data['city']
    country = data['country']

    # --- Database connection and data insertion ---
    try:
        # Connect to the MySQL database
        conn = mysql.connector.connect(**db_config)
        cursor = conn.cursor()

        # SQL query to insert data into the table
        sql_query = """
            INSERT INTO users (name, age, gender, city, country)
            VALUES (%s, %s, %s, %s, %s)
        """
        
        # Data to be inserted
        record_to_insert = (name, age, gender, city, country)

        # Execute the query
        cursor.execute(sql_query, record_to_insert)

        # Commit the changes to the database
        conn.commit()

        # Close the cursor and connection
        cursor.close()
        conn.close()

        # Return a success message
        return jsonify({"message": "Data inserted successfully"}), 201

    except mysql.connector.Error as err:
        # Handle database errors
        print(f"Database error: {err}")
        return jsonify({"error": "Failed to store data in the database"}), 500

# Run the Flask app
if __name__ == '__main__':
    # You can set debug=True for development to get more detailed error messages
    app.run(debug=True)
