FROM registry.access.redhat.com/ubi8/openjdk-11

MAINTAINER Christopher Tate <computate@computate.org>

ENV SITE_PORT=12080

USER root

COPY . vertx-bug

WORKDIR /home/jboss/vertx-bug
RUN mvn clean install -DskipTests
CMD mvn exec:java -Dexec.mainClass=org.computate.vertx.bug.verticle.QuarkusApp
