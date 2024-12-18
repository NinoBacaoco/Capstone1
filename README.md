# SPOTSelect: Incubatee Application Review and Selection Process

## Table of Contents

1. [Overview](#overview)
2. [Technologies Used](#technologies-used)
3. [Project Structure](#project-structure)
   - [Backend](#backend)
   - [Frontend](#frontend) 
4. [Installation](#installation)

## Overview

This project aims to develop a comprehensive web application to facilitate the application review and selection process for incubatee programs. The application streamlines the multi-step process where applicants submit their applications to a system, ensuring an efficient review workflow by designated roles.

## Technologies Used

- **Frontend:**

  - HTML/CSS: For structuring and styling the application interface.
  - Thymeleaf: For dynamic server-side rendering of web pages.
  - Bootstrap 4.0.0: For responsive design and styled components, particularly in table layouts.
  - JavaScript/jQuery 3.6.4: For client-side interactivity and data manipulation.

- **Backend:**
  - Spring Boot 3.2.6: For creating the RESTful API and managing the application server.
  - PostgreSQL: As the relational database for persistent data storage.
  - Java 17: For business logic implementation and application workflows.

## Project Structure

### Backend

- **common**: Contains utility classes and shared components used across the application.
- **controller**: Implements RESTful endpoints for handling incoming requests.
- **service**: Contains business logic and service layer methods for processing application data.
- **repository**: Abstracts database operations, providing methods for CRUD functionalities.
- **model**: Defines the data structures for applicants, evaluations, and other entities.

### Frontend

- **templates**: Holds HTML templates processed by Thymeleaf.
- **static**: Contains static resources such as CSS and JavaScript files.

## Installation
1. Install Java 17 JDK
2. Install PostgreSQL

3. Clone the Repository: git clone https://github.com/NinoBacaoco/Capstone1

4. Install Dependencies: npm install or npm i
5. Configure database connection in application.properties
6. mvn clean install
7. mvn spring-boot:run
8. once running, access the application through a web browser at http://localhost:8080