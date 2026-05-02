# 2400032141-FSAD-SKILL-END-EXAM

## Project Structure

```text
hibernate-course-project
│── pom.xml
│── README.md
│
└── src
    └── main
        ├── java
        │   └── com
        │       └── klef
        │           └── fsad
        │               └── exam
        │                   ├── Course.java
        │                   └── ClientDemo.java
        │
        └── resources
            └── hibernate.cfg.xml
```

            
## Hibernate Course Project

This project is developed as part of the FSAD Skill End Examination.

## Technologies Used

* Java
* Hibernate ORM
* Maven
* MySQL
* Eclipse / Spring Tool Suite

## Project Description

The project demonstrates Hibernate integration with MySQL using Maven.
It performs Course table operations such as:

* Insert new course record
* View course details
* Automatic table creation using Hibernate

## Database Details

* Database Name: fsadendexam
* Table Name: courses

## Project Structure

src/main/java/com/klef/fsad/exam/
 Course.java
 ClientDemo.java

src/main/resources/
 hibernate.cfg.xml

## How to Run

1. Create MySQL database:

CREATE DATABASE fsadendexam;

2. Update username and password in hibernate.cfg.xml

3. Run:

ClientDemo.java

4. Verify inserted data:

USE fsadendexam;
SELECT * FROM courses;

## Output

Successful insertion of course records into MySQL database using Hibernate.

## Author

Vidya Jagabattula
KL University
