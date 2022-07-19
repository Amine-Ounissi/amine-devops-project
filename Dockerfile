FROM openjdk:8
ADD target/amine-project-1.0.jar amine-project-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "amine-project-1.0.jar"]
