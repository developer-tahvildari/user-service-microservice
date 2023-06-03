# Base image
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory
WORKDIR /app

# Copy the JAR file
COPY target/user-service.jar user-service.jar

# Expose the port
EXPOSE 8080

# Set the entrypoint command
ENTRYPOINT ["java", "-jar", "user-service.jar"]
