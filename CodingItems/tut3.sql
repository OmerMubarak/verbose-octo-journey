SHOW TABLES;
SHOW DATABASEs;
CREATE DATABASE School;
DESCRIBE pupils;
DROP TABLE pupils;
DROP TABLE enrollment;
DROP TABLE classes;
DROP TABLE DEPARTMENT;
DROP TABLE teachers;
SELECT * FROM pupils;
SELECT * FROM department;
SELECT * FROM classes;
SELECT * FROM enrollment;


CREATE TABLE pupils (
	studentid int NOT NULL AUTO_INCREMENT PRIMARY KEY UNIQUE,
    name varchar(100) NOT NULL,
    class1 int NOT NULL,
    class2 int NOT NULL,
    AGE smallint NOT NULL
    );

INSERT INTO pupils (name, age, class1, class2)
VALUES ('James', 12, 1, 4);
INSERT INTO pupils (name, age, class1, class2)
VALUES ('Nick', 15, 4, 5);
INSERT INTO pupils (name, age, class1, class2)
VALUES ('Senna', 17, 3, 2);
INSERT INTO pupils (name, age, class1, class2)
VALUES ('Luci', 19, 2, 1);
INSERT INTO pupils (name, age, class1, class2)
VALUES ('Trey', 22, 3, 1);

    
CREATE TABLE classes (
	classid int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    subjectname varchar(100) NOT NULL,
    s_description varchar(100) NOT NULL,
    s_level int NOT NULL
    );

INSERT INTO classes (subjectname, s_description, s_level)
values ('English', 'ENGLISH is a subject that requires dedication', '9');
INSERT INTO classes (subjectname, s_description, s_level)
values ('Chemistry', 'Chemistry is a subject that requires very much dedication', '2');
INSERT INTO classes (subjectname, s_description, s_level)
values ('Social Studies', 'Studies of the modern age', '5');
INSERT INTO classes (subjectname, s_description, s_level)
values ('History', 'Lessons of the past are seeds for the future', '7');
INSERT INTO classes (subjectname, s_description, s_level)
values ('Maths', 'Calculating how many watermelons you have to buy', '1');

CREATE TABLE enrollment (
	enrollmentid INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fk_studentid int NOT NULL,
    fk_classid int NOT NULL,
    fk_classid2 int NOT NULL,
    FOREIGN KEY (fk_studentid) REFERENCES pupils(studentid),
    FOREIGN KEY (fk_classid) REFERENCES classes(classid),
    FOREIGN KEY (fk_classid2) REFERENCES classes(classid)
    );
    
INSERT INTO enrollment (fk_studentid, fk_classid, fk_classid2)
VALUES (1, 1, 4);
INSERT INTO enrollment (fk_studentid, fk_classid, fk_classid2)
VALUES (2, 4, 5);
INSERT INTO enrollment (fk_studentid, fk_classid, fk_classid2)
VALUES (3, 3, 2);
INSERT INTO enrollment (fk_studentid, fk_classid, fk_classid2)
VALUES (4, 2, 1);
INSERT INTO enrollment (fk_studentid, fk_classid, fk_classid2)
VALUES (5, 3, 1);

CREATE TABLE teachers (
	teacherid int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    t_subjects int NOT NULL,
    FOREIGN KEY (t_subjects) REFERENCES classes(classid)
    );   
    
INSERT INTO teachers (name, t_subjects) 
VALUES ('Garet', '2');
INSERT INTO teachers (name, t_subjects) 
VALUES ('Dr. Mondo', '1');
INSERT INTO teachers (name, t_subjects) 
VALUES ('Vain', '4');
INSERT INTO teachers (name, t_subjects) 
VALUES ('Jarvon', '5');
INSERT INTO teachers (name, t_subjects) 
VALUES ('Yamuo', '3');

CREATE TABLE department (
	departmentid INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    departmentname VARCHAR(100) NOT NULL,
    departmentsubject INT NOT NULL,
    FOREIGN KEY (departmentsubject) REFERENCES classes(classid)
    );
    
INSERT INTO department (departmentname,departmentsubject)
VALUES ('Sciences',1);
INSERT INTO Department (departmentname,departmentsubject)
VALUES ('Linguistic',4);
INSERT INTO Department (departmentname,departmentsubject)
VALUES ('OTHER',5);

SELECT * FROM department;
    
SELECT d.departmentname, c.subjectname, t.name
FROM department d 
JOIN classes c ON c.classid=d.departmentsubject 
JOIN teachers t ON t.t_subjects=c.classid;

SELECT p.name, c.subjectname
from pupils p
JOIN classes c ON c.classid WHERE c.classid=p.class1;

SELECT p.name, c.subjectname, e.enrollmentid, p.class1, p.class2
from pupils p
JOIN enrollment e ON p.studentid=e.fk_studentid
JOIN classes c ON c.classid=fk_classid;

SELECT p.name, c.subjectname
from pupils p
JOIN enrollment e ON p.studentid=e.fk_studentid
JOIN classes c ON c.classid=fk_classid2 
WHERE c.subjectname="English";


DROP TABLE ENROLLMENT;
SELECT * FROM pupils;
SELECT * FROM enrollment;
SELECT * FROM classes;