# Use an official OpenJDK runtime as a parent image
FROM openjdk:17
EXPOSE 8080
ADD target/spring-boot-pgsql.jar spring-boot-pgsql
ENTRYPOINT [ "java",".jar","/spring-boot-pgsql.jar" ]