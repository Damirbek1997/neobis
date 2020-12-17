FROM openjdk:8
EXPOSE 8081
ARG JAR_FILE=target/week10.jar
ADD ${JAR_FILE} week10.jar
ENTRYPOINT ["java","-jar","week10.jar"]