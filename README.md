# Hibernate CRUD Application

## Overview
This is a **Hibernate CRUD Application** that demonstrates database operations using Hibernate ORM framework. It includes basic operations such as Create, Read, Update, and Delete (CRUD) on entities like `Product` and `Employee`.

## Features
- Hibernate ORM integration
- CRUD operations on database entities
- MySQL database connectivity
- Maven for dependency management
- Simple and modular structure

## Technologies Used
- Java
- Hibernate ORM
- MySQL (or any relational database)
- Maven
- Eclipse or IntelliJ IDEA

## Project Structure
```
Hibernate/
│── src/main/java/com/learning/Hibernate/
│   ├── Main.java  # Application entry point
│   ├── Product.java  # Entity class for product management
│   ├── CRUD/Employee.java  # Entity class for employee management
│── src/main/resources/
│   ├── hibernate.cfg.xml  # Hibernate configuration
│── pom.xml  # Maven dependencies
```

## Prerequisites
- Install Java (JDK 11 or later)
- Install MySQL and set up a database
- Install Maven
- Configure database settings in `hibernate.cfg.xml`

## Setup & Installation
1. Clone the repository or extract the ZIP folder.
2. Open the project in an IDE (Eclipse, IntelliJ, or VS Code).
3. Configure the database connection in `hibernate.cfg.xml`:
   ```xml
   <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/your_database</property>
   <property name="hibernate.connection.username">root</property>
   <property name="hibernate.connection.password">password</property>
   ```
4. Build and run the project using Maven:
   ```sh
   mvn compile
   mvn exec:java -Dexec.mainClass="com.learning.Hibernate.Main"
   ```

## Running the Application
- Execute `Main.java` to test Hibernate CRUD operations.
- Check the database for the expected changes.

## Contributing
Feel free to fork this repository and contribute by submitting pull requests.

## License
This project is licensed under the MIT License.

