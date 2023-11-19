FROM openjdk:8-jdk-alpine
MAINTAINER bits.com
COPY target/supplyChain-0.0.1-SNAPSHOT.jar supplyChain-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/supplyChain-0.0.1-SNAPSHOT.jar"]