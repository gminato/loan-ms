# Loan Management System

## Overview
The Loan Management System is a Java-based application designed to manage loan-related operations. It provides functionalities for creating, updating, and tracking loans. This is a part of bank-ms.[Bank Microservice](https://github.com/gminato/bank-ms).

## Features
- Create new loan applications
- Update existing loan details
- Gib to generate docker images

## Technologies Used
- Java
- Spring Boot
- Hibernate
- postgressql
- docker 

## Prerequisites
- JDK 21 or higher
- Maven
- docker

## Setup Instructions
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/loan-ms.git
    ```
2. Navigate to the project directory:
    ```bash
    cd loan-ms
    ```
3. Configure the postgres database in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/loan_db
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    ```
4. Build the project using Maven:
    ```bash
    mvn clean install
    ```

## Usage
- Access the application at `http://localhost:8080`
- Use the provided endpoints to manage loans

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact
For any inquiries, please contact [yourname@example.com](mailto:yourname@example.com).
