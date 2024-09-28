# WIL: Incubatee Application Review and Selection Process

## Table of Contents

1. [Overview](#overview)
2. [Technologies Used](#technologies-used)
3. [Project Structure](#project-structure)
   - [Backend](#backend)
   - [Frontend](#frontend)
4. [Functional Components](#functional-components)
5. [Key Features](#key-features)
6. [Installation](#installation)

## Overview

This project aims to develop a comprehensive web application to facilitate the application review and selection process for incubatee programs. The application streamlines the multi-step process where applicants submit their applications to a system, ensuring an efficient review workflow by designated roles.

## Technologies Used

- **Frontend:**

  - HTML/CSS: For structuring and styling the application interface.
  - Thymeleaf: For dynamic server-side rendering of web pages.
  - Bootstrap 4.0: For responsive design and styled components, particularly in table layouts.
  - JavaScript/jQuery: For client-side interactivity and data manipulation.

- **Backend:**
  - Spring Boot: For creating the RESTful API and managing the application server.
  - PostgreSQL: As the relational database for persistent data storage.
  - Java: For business logic implementation and application workflows.

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

## Functional Components

- **Applicant Submission**: Applicants can submit their applications with required documentation.
- **Application Review**: Officers evaluate applications using a checklist that includes documentary requirements and pre-screening criteria.
- **Manager Dashboard**: Managers have access to analytics related to application statuses, including the number of applications under review and historical trends.
- **TBIboard Evaluation**: The TBIboard reviews accepted applications and evaluates them based on defined criteria, including technical viability and scalability.

## Key Features

- **Dynamic Application Lists**: Officers and TBIboard members can view lists of applications in real-time, with filtering options based on status.
- **Feedback Mechanism**: Feedback can be provided at various stages of the application review process.
- **Certificate Issuance**: Managers can issue certificates to applicants based on evaluation results.
- **Reporting**: Managers can generate reports on application statuses and evaluation outcomes.

## Installation

1. **Clone the Repository**:
   git clone https://github.com/NinoBacaoco/Capstone1

2. **Navigate to the Project Directory**:
   cd capstone1

3. **Install Dependencies**:
   npm install or npm i
