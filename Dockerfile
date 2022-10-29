FROM openjdk:8
EXPOSE 8080
ADD target/learn-docker.jar learn-docker.jar
ENTRYPOINT ["java","-jar","/learn-docker.jar"]