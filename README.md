# Introduction

An application that i created for my self-study that has a registration feature with email confirmation with many approaches applied.

# Tech Stack

I used these tech stack for create this project with:
* Java 8
* [Spring Boot](https://spring.io/projects/spring-boot)
* MySQL
* [Mailtrap](https://mailtrap.io/)
* [Kafka](https://kafka.apache.org/) (for event-driven)

# Architecture

## Registration Flow - Synchronous Approach

Detail : [Click Here](https://github.com/rizkyjayusman/cygnus/tree/approach/syncronous-way)

<div align='center'>

![Registration Flow - Synchronous Approach](docs/syncronous-approach.png)

</div>

## Registration Flow - Event Driven Approach

Detail : [Click Here](https://github.com/rizkyjayusman/cygnus/tree/approach/event-driven-approach)

<div align='center'>

![Registration Flow - Event Driven Approach](docs/event-driven-approach.png)

</div>

## Registration Flow - Communication through Data Approach

Detail : [Click Here](https://github.com/rizkyjayusman/cygnus/tree/approach/data-approach)

<div align='center'>

![Registration Flow - Communication through Data Approach](docs/data-approach.png)

</div>

# Build and Run


```
1. Clone the Project
   $ git clone git@github.com:rizkyjayusman/cygnus.git
   $ cd cygnus

2. Build and Package the Project
   $ mvn -e clean package

3. Run the Project
   $ java -jar /cygnus-project-path/app.jar
```
