FROM openjdk:11
EXPOSE 8080
ADD target/dataserviceapp.jar dataserviceapp.jar
ENTRYPOINT ["java","-jar","/dataserviceapp.jar"]