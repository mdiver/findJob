FROM openjdk:8-jdk-alpine

VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} findjob-springboot.jar

#ENV JAVA_OPTS="$JAVA_OPTS \
#  -XX:MetaspaceSize=128m \
#  -XX:MaxMetaspaceSize=128m \
#  -Xms512m \
#  -Xmx1024m"

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/findjob-springboot.jar"]~
