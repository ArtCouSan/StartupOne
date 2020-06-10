FROM maven AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/discovery/
COPY src /tmp/discovery/src/
WORKDIR /tmp/discovery/
RUN mvn package

FROM openjdk:11
WORKDIR /opt/v1/posts
RUN mvn clean install
COPY target/discovery-server.jar discovery-server.jar
EXPOSE 8761

CMD ["java", "-jar", "discovery-server.jar.jar"]
