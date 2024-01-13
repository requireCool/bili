FROM eclipse-temurin:17-jre-alpine

COPY target/BILIBILI-HELPER-*.jar /app/BILIBILI-HELPER.jar

ENTRYPOINT ["entrypoint.sh"]