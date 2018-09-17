# izdatkiBack

Backend for application Izdatki.
Writen with Java Spring framework.
Database 


# Izdatki
> Simple application for logging your expenses and incomes.

Database: MariaDB
username: root
password: root

SQL scripts and instructions are available in [database] folder.

## Requirements
1. Maven
```bash
mvn -v
```

2. Java JRE
```bash
java -version
```

3. Running MySQL/MariaDB on localhost and listening on port 3306

## How to run
1. Build project
```bash
mvn clean package
```

2. Run
```bash
cd target
java -jar user-portal-0.0.1.jar
```