FROM openjdk:8-jdk-alpine

COPY /target/company-0.0.1-SNAPSHOT.jar findjob-springboot.jar

#ENV JAVA_OPTS="$JAVA_OPTS \
#  -XX:MetaspaceSize=128m \
#  -XX:MaxMetaspaceSize=128m \
#  -Xms512m \
#  -Xmx1024m"

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","findjob-springboot.jar"]~
