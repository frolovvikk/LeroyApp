FROM openjdk:latest
ADD ./target/LeroyApp-1.0.jar ./data/LeroyApp-1.0.jar
CMD ["java", "-jar", "/data/LeroyApp-1.0.jar"]