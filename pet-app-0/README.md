# PetApp0
This project follows along with Project 0, a testing-focused REST API project.

---

## **Back End**

General: Java, Maven, Javalin, JUnit, PostgreSQL JDBC

### **Beans**

- Pet: id, name, species, description, age, status
    - status: Available, Adopted
- Person: id, fullName, username, password, role, pets
    - role: User, Employee

### **Data Layer**

- PetDAO
    - *PetCollections: *only to be used before covering JDBC*
    - PetPostgres: JDBC implementation for PostgreSQL database
- PersonDAO
    - *PersonCollections: *only to be used before covering JDBC*
    - PersonPostgres: JDBC implementation for PostgreSQL database

### **Service Layer**

- TBD

### **App/Controller Layer**

- PetApp: main class with Javalin routes, etc.
- Controllers: TBD

### **Testing**

- Unit tests for data and service layers

---

## **Database**

General: PostgreSQL (Local or RDS)

### **Tables**

- **person**: id, full_name, username, passwd, role_id
    - stores data about users of the application

- **pet**: id, name, species, description, age, status_id
    - stores data about pets in the application

- **status**: id, name
    - represents the status of a pet (Available or Adopted)
    - could potentially add more statuses later (i.e. Fostered, etc)

- **user_role**: id, name
    - represents the user roles (User, Employee)
    - could potentially add more roles later (i.e. Manager, etc)

- **person_pet**: person_id, pet_id
    - represents the ownership relationship between a pet and its owner