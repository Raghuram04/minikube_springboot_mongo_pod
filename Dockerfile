FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} springboot_mongo.jar
ENTRYPOINT ["java","-jar","/springboot_mongo.jar"]