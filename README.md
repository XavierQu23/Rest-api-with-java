#  README

# API REST - Proof of Concept

This project is a proof of concept that implements a simple REST API using *Spring Boot*. It demonstrates how to expose a basic REST endpoint.

## Description

The API exposes a single GET endpoint, /sayHello, which responds with a simple greeting message.

### Technologies Used

- *Java*: The main programming language.
- *Spring Boot*: The framework used to build the REST API.
- *Maven*: A tool for dependency management and project build automation.

## Project Structure
src/main/java └── com └── mipagina └── api_rest └── controller └── HelloWorldController.java └── ApiRestApplication.java


## How to Run the Project:

Prerequisites:
- Java 17 or higher.
- Maven installed.

Steps to Run:
1. Clone this repository:
    ``` 
    bash
   git clone https://github.com/XavierQu23/Rest-api-with-java.git
   cd ApiRest-with-Java 

2. Compile and run the project using Maven:
```mvn spring-boot:run```

3. Access the endpoint from your browser or a testing tool like Postman:
```http://localhost:8080/sayHello```

4. You will receive the following response:
```hello everyone, i am xavi```

# RESULTS
![image](https://github.com/user-attachments/assets/5c0898c4-ac05-421a-974c-808508f84709)


   
