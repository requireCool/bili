FROM eclipse-temurin:17-jre-alpine

VOLUME ["/config"]

COPY target/BILIBILI-HELPER-*.jar /app/BILIBILI-HELPER.jar
COPY entrypoint.sh /app/entrypoint.sh

RUN chmod +x /app/entrypoint.sh

ENTRYPOINT ["/app/entrypoint.sh"]