FROM eclipse-temurin:17-jre-alpine
VOLUME /tmp
COPY ./build/libs/weight-and-measures-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
ENV TZ="Europe/Madrid"