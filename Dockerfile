FROM registry.access.redhat.com/ubi8/openjdk-11

MAINTAINER Christopher Tate <computate@computate.org>

ENV SITE_PORT=12080

USER root

COPY . vertx-bug

WORKDIR /home/jboss/vertx-bug
RUN mvn clean install -DskipTests
RUN cp /home/jboss/vertx-bug/target/*.jar /home/jboss/app.jar
WORKDIR /home/jboss
CMD java $JAVA_OPTS -cp .:* org.computate.vertx.bug.verticle.MainVerticle
