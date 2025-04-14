# Use a base image with OpenJDK
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the Spring Boot JAR into the container
COPY target/monitoring-learning-0.0.1-SNAPSHOT.jar /app/monitoring-learning-0.0.1-SNAPSHOT.jar

# Expose the port the app runs on
EXPOSE 8080

# Command to run the Spring Boot app
ENTRYPOINT ["java", "-jar", "/app/monitoring-learning-0.0.1-SNAPSHOT.jar"]
