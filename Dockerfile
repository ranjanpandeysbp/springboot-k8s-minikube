FROM openjdk:11
EXPOSE 8080
ADD target/k8s-app-0.0.1-SNAPSHOT.jar k8s-app-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/k8s-app-0.0.1-SNAPSHOT.jar"]