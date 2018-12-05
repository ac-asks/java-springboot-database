# Spring Boot MVC Application

This code repository contains the quick database I built with the Spring Boot framework. This was ultimately my project that I undertook after learning Java and introduced me to the MVC architectural pattern and POST and GET requests. It is a student database  that contains their id, name and area of study. 

This will tweaked later to pull from MongoDB.

** Note: This was a small experimental project

## How it works

It implements an N tier architecture application with a student database (id, name, study). 

Layer 1 is the controller - handles http request REST API.
Layer 2 is the service.
Layer 3 is the data access for retrieving data from db (in this case, MongoDB).

## More information
This was built using the following tutorials and resources:
* [Learn Spring Boot (MVC) in 50 Minutes](https://www.youtube.com/watch?v=Ke7Tr4RgRTs)
* [Getting Started: Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/)
* [Spring Framework Documentation](https://docs.spring.io/spring/docs/current/spring-framework-reference/)