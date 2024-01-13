FROM eclipse-temurin:17-jre-alpine

ADD target/BILIBILI-HELPER-*.RELEASE.jar /app/BILIBILI-HELPER.jar

ENTRYPOINT ["entrypoint.sh"]