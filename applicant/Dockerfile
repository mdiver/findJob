FROM openjdk:8-jdk-alpine

COPY /target/applicant-0.0.1-SNAPSHOT.jar findjob-applicant-springboot.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","findjob-applicant-springboot.jar"]~
