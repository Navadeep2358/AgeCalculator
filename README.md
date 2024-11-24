# Age Calculator Web Application

This project is a simple **Age Calculator Web Application** developed using **Java Servlet** and **HTML**. It allows users to input their **name**, **email**, and **date of birth**, and the system calculates their **age** based on the current date. The result is displayed on a web page with a personalized message.

## Features
- **User Input Form**: Users can input their **name**, **email**, and **date of birth** through a simple HTML form.
- **Age Calculation**: Upon submitting the form, the system calculates the user's age based on the date of birth provided.
- **Personalized Output**: The result is displayed with the user's name, email, date of birth, and calculated age.
- **Servlet-based Logic**: The backend logic for calculating the age is implemented in a **Java Servlet**.

## Technologies Used
- **Java**: The backend logic is implemented using Java.
- **Servlets**: Java servlets handle the HTTP requests and perform the age calculation.
- **HTML**: A simple form is used for user input.
- **Maven**: Project dependency management and build automation.

## Getting Started

### Prerequisites
1. **Java JDK 8 or higher**: Ensure you have Java 8 or higher installed on your system.
2. **Apache Tomcat**: This application is intended to be deployed on an Apache Tomcat server.
3. **Maven**: To build the project.

### Setup Instructions
1. **Clone the repository**:
    ```bash
    git clone <repository-url>
    ```

2. **Build the Project**:
    Navigate to the project directory and use Maven to build the WAR file:
    ```bash
    mvn clean package
    ```

3. **Deploy on Apache Tomcat**:
    Copy the `basic-webapp.war` file to the `webapps` directory of your Tomcat server.

4. **Run the Application**:
    - Start the Tomcat server.
    - Open a browser and visit: 
      ```http
      http://localhost:8080/basic-webapp/
      ```

    The Age Calculator form will be displayed, where you can enter the required details.

## Usage
1. Enter your **name** and **email** in the respective fields.
2. Select your **date of birth**.
3. Click the **Submit** button.
4. The system will calculate and display your age along with the input details.

## Code Structure
- **`index.html`**: Contains the form where the user enters their information.
- **`AgeCal.java`**: Java Servlet that handles the logic of calculating the age and displaying the result.
- **`web.xml`**: Servlet mapping configuration for the application.
- **`pom.xml`**: Maven configuration for managing project dependencies and building the application.

## License
This project is open-source and available under the [MIT License](LICENSE).
