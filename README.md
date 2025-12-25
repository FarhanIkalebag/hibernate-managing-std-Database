# Hibernate Data Management (GET & DELETE)

This project is a Java-based persistence module built using Hibernate ORM and Maven, integrated with a MySQL database. It demonstrates effective use of Hibernate for entity retrieval (GET) and entity deletion (DELETE) operations with proper session and transaction management.

## Technology Stack
- Java
- Hibernate ORM
- Maven
- MySQL
- JPA (Annotations)

## Project Overview
The application uses Hibernate’s ORM capabilities to interact with the database instead of direct JDBC queries. Entity mapping is handled using annotations, and all database operations are executed within transactional boundaries to ensure consistency.

## Entity Details
The `Student` entity is mapped to a database table and contains the following fields:
- `id` (Primary Key, Auto-generated)
- `name`
- `marks`
- `email`

## Core Functionalities

### Retrieve Student (GET)
- Uses `session.get(Student.class, id)`
- Fetches a student record based on the provided primary key
- Ensures null checks before performing operations

### Delete Student (DELETE)
- Deletes the student record only if it exists
- Operation is executed within an active Hibernate transaction
- Commits changes after successful deletion

## Hibernate Configuration
- Configuration is managed via `hibernate.cfg.xml`
- MySQL dialect is used
- SQL logging is enabled for better visibility
- Entity class is explicitly mapped

## Build and Dependency Management
- Maven is used for project build and dependency management
- Includes dependencies for:
  - Hibernate Core
  - MySQL JDBC Driver

## Execution Flow
1. Create `SessionFactory`
2. Open Hibernate `Session`
3. Begin transaction
4. Retrieve `Student` entity using ID
5. Delete entity if present
6. Commit transaction
7. Close session and factory

## How to Run
1. Create the database - sql, CREATE DATABASE hibernatedb;
2. Update database credentials in hibernate.cfg.xml
3. Run the App.java class
4. Enter the Student ID when prompted
5. The corresponding record will be deleted if it exists
