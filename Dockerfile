FROM openjdk:21-jdk-slim
EXPOSE 8081
COPY target/minimumfromfile-0.0.1-SNAPSHOT.jar /home/minimumfromfile.jar
ENTRYPOINT ["java","-jar","/home/minimumfromfile.jar"]