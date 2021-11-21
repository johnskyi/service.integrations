FROM  adoptopenjdk/openjdk8
VOLUME /usr/app
EXPOSE 8086
ARG JAR_FILE=target/service.integrations-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} service.integrations-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","service.integrations-0.0.1-SNAPSHOT.jar"]
