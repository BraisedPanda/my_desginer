FROM openjdk:8
MAINTAINER braised_panda
LABEL app="class-provider" version="0.0.1" by="braised_panda"
ADD shadow_thief-0.0.1-SNAPSHOT.jar /demo.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo.jar"]
