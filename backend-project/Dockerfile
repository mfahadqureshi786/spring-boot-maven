# Use a lightweight JDK image
FROM openjdk:17-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy any JAR file from target/ into the container
COPY target/*.jar app.jar

# Expose application port
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]