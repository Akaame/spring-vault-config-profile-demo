FROM openjdk:11-jre
WORKDIR /app
COPY target/springvaultdemo-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]