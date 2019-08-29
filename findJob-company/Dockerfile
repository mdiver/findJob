FROM openjdk:8-jdk-alpine

COPY /target/company-0.0.1-SNAPSHOT.jar findjob-company-springboot.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","findjob-company-springboot.jar"]~
