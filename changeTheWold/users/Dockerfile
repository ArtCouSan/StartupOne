FROM openjdk:11 as build
WORKDIR /workspace/v1/users

COPY /users/mvnw .
COPY /users/.mvn .mvn
COPY /users/pom.xml .
COPY /users/src src

RUN chmod +x ./mvnw
RUN ./mvnw install -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

FROM openjdk:11
VOLUME /tmp
ARG DEPENDENCY=/workspace/v1/users/target/dependency
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
EXPOSE 8081
ENTRYPOINT ["java","-cp","app:app/lib/*","br.com.users.UsersApplication"]