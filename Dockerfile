FROM gradle:jdk11-openj9
COPY --chown=gradle:gradle . /home/gradle/src

RUN mkdir /app

COPY build.gradle.kts gradle gradlew gradlew.bat settings.gradle.kts /app/
COPY src/ /app/src/

EXPOSE 8888

ENTRYPOINT ["gradle", "-p", "/app/", "bootRun"]
