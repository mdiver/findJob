FROM openjdk:8-jdk-alpine

COPY /target/recruit-0.0.1-SNAPSHOT.jar findjob-recruit-springboot.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","findjob-recruit-springboot.jar"]~
