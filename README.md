# TaskMate
Spring Boot Project
**TaskMate** is a simple task management **REST API** built with **Java**, **Spring Boot**, and **MongoDB**. The app provides functionality for task creation, retrieval, deletion, and listing. It connects to a MongoDB Atlas cloud instance and uses Spring Data MongoDB, with project configuration simplified through **Lombok**.


## Features
- **Create Task**: Add a new task to the database.
- **Get All Tasks**: Retrieve a list of all tasks.
- **Get Task by ID**: Fetch details of a specific task using its unique identifier.
- **Delete Task by ID**: Remove a task from the database using its ID.

## Technologies Used
-  **Spring Boot**: Backend framework for building REST APIs.
-  **MongoDB Atlas**: Cloud-based NoSQL database to store task data.
-  **Spring Data MongoDB**: For seamless MongoDB integration in Spring Boot.
-  **Lombok**: Reduces boilerplate code with annotations for getters, setters, constructors, etc.
-  **Maven**: Project build and dependency management.

## Endpoints
-  **POST/task** : Create a new Task
-  **GET/task** : Retrieve all taska
-  **GET/tsak/{id}** : Retrieve task by id
-  **DELETE/task/{id}** : Delete task by id


