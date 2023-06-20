FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar dabsmvp.jar
ENTRYPOINT ["java","-jar","/dabsmvp.jar", "-web -webAllowOthers -tcp -tcpAllowOthers -browser"]
EXPOSE 8080