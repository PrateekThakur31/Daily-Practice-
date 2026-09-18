CREATE DATABASE practice_db;

USE practice_db;

CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    salary DOUBLE,
    managerId int not null
);

INSERT INTO employee VALUES
(1, 'Prateek', 50000),
(2, 'Rahul', 60000),
(3, 'Amit', 45000);

SELECT * FROM employee;


SELECT e.name AS Employee
FROM Employee e
         JOIN Employee m
              ON e.managerId = m.id
WHERE e.salary > m.salary;

