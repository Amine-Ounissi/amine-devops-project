## Personal Project
				
				
Creation of a CI/CD pipeline for a Spring Boot application with MVC architecture (Model, View, Controller)

Tools:

-Jenkins
-Github
-Docker
-Nexus
-Azure
-Kubernetes

##Spring MVC framework consists of four components : Model, View, Controller, and Front Controller
This application is packaged as jar file which can be run on a docker container.
The tomcat is embedded in the application set-up so no need to configure it separately. 
In order to run the application we must install few things as follows.

-Java 1.8 or higher
-Maven
About the Service
This API exposes the following services:

-Create a new blog entry.
For Create: http://localhost:8080/myblog/create

-Update a blog entry.
For Update: http://localhost:8080/myblog/update

-Delete a blog entry.
For delete: http://localhost:8080/myblog/delete/{id}

-View a particular blog entry.
For View particular blog: http://localhost:8080/myblog/view/{id}

-View all the blog entry in the database.
For View all: http://localhost:8080/myblog/viewall

Jenkins Credentials:
![credentials](https://user-images.githubusercontent.com/73407173/189351754-574ed6cb-5e1f-4721-be0d-00e3d6dbef08.png)

Jenkins CI/CD pipeline:
![pipeline](https://user-images.githubusercontent.com/73407173/189350363-04554c3d-bacc-4083-81f4-2c7c0400b06f.png)

Sonatype Nexus Repository Manager:
![nexus](https://user-images.githubusercontent.com/73407173/189350407-d2f7984e-23ba-494c-bee3-7192cd58806b.png)

AKS Cluster Service and ingresses:
![service1](https://user-images.githubusercontent.com/73407173/189350438-9bb3e2eb-e0a2-44c9-b21e-69332bbbb52d.png)


