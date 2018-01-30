#Service 1 sample Image
FROM openjdk:8
ADD target/Spring-Zipkin-3-0.0.1-SNAPSHOT.jar Spring-Zipkin-3-0.0.1-SNAPSHOT.jar
EXPOSE 9102
ENTRYPOINT ["java","-jar","Spring-Zipkin-3-0.0.1-SNAPSHOT.jar"]