# SpringBoot
This Project is a simple spring boot application for employee management.
Database is imitated with in memory datastructure right now and can be changed to any other databse when required.
H2 database implementation development is currently in progress.

Tests:
Can be tested with any browser/Rest client with below URLs:
GET http://localhost:8080/emplpyees -> get all employee list
GET http://localhost:8080/employees/{id} -> get employee by id
DELETE http://localhost:8080/employees/{id} -> delete employee by id
PUT http://localhost:8080/employees with BODY -> update the employee
POST http://localhost:8080/employees with POST BODY -> add the employee
