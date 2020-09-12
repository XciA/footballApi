FROM openjdk:8-jdk-alpine
WORKDIR /usr/src/sapient-test
COPY /target/footballApi-0.0.1-SNAPSHOT.jar /usr/src/sapient-test/footballApi-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD java -jar footballApi-0.0.1-SNAPSHOT.jar
