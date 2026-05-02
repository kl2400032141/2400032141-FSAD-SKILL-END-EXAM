# Maven Hibernate Course Project

## Project Structure

```
hibernate-course-project/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── com/klef/fsad/exam/
        │       ├── Course.java          ← Entity Class
        │       └── ClientDemo.java      ← Client Demo Class
        └── resources/
            └── hibernate.cfg.xml       ← Hibernate Configuration
```

## Package
`com.klef.fsad.exam`

## Database
**Name:** `fsadendexam`

## Entity: `Course`

| Column             | Type        | Details                  |
|--------------------|-------------|--------------------------|
| course_id          | INT (PK)    | Auto-generated           |
| course_name        | VARCHAR(100)| Course name              |
| course_description | VARCHAR(500)| Description              |
| course_date        | DATE        | Start date               |
| course_status      | VARCHAR(50) | e.g. Active / Upcoming   |
| course_duration    | INT         | Duration in hours        |
| course_instructor  | VARCHAR(100)| Instructor name          |
| course_credits     | INT         | Credit hours             |

## Operations (in `ClientDemo`)

| Operation | Description                       |
|-----------|-----------------------------------|
| I         | Insert a new Course into the DB   |
| II        | View a Course record by ID        |

---

## Setup & Run Instructions

### Prerequisites
- Java 11+
- Maven 3.6+
- MySQL Server running locally

### Step 1: Create the Database

Open your MySQL client and run:

```sql
CREATE DATABASE fsadendexam;
```

### Step 2: Configure DB Credentials

Edit `src/main/resources/hibernate.cfg.xml` and update:

```xml
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">your_password</property>
```

### Step 3: Build the Project

```bash
mvn clean compile
```

### Step 4: Run the ClientDemo

```bash
mvn exec:java -Dexec.mainClass="com.klef.fsad.exam.ClientDemo"
```

Or run `ClientDemo.java` directly from your IDE (Eclipse / IntelliJ).

---

## Expected Output

```
========================================
   Maven Hibernate - Course Operations  
   Database : fsadendexam               
========================================

--- I. Inserting a new Course ---
✅ Course inserted successfully with ID: 1

--- II. Viewing Course by ID: 1 ---
✅ Course found:
Course {
  ID          : 1
  Name        : Full Stack Application Development
  Description : A comprehensive course covering ...
  Date        : 2024-06-01
  Status      : Active
  Duration    : 60 hrs
  Instructor  : Dr. A. Kumar
  Credits     : 4
}
...
```

> **Note:** Hibernate will auto-create the `courses` table on first run (`hbm2ddl.auto=update`).
