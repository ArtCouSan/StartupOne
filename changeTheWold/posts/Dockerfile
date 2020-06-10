FROM maven AS MAVEN_TOOL_CHAIN
WORKDIR /tmp/v1-posts/
COPY pom.xml /tmp/v1-posts/
COPY /src /tmp/v1-posts/src/
RUN mvn package

FROM openjdk:11
WORKDIR /opt/v1/posts
RUN mvn clean install
COPY target/v1-posts.jar v1-posts.jar
EXPOSE 8080

CMD ["java", "-jar", "v1-posts.jar"]