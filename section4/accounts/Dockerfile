# Use the official OpenJDK 17 image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
MAINTAINER PhongHH

# Copy the current directory contents into the container at /app
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Make port 8080 available to the world outside this container
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]
