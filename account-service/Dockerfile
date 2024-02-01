# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-alpine


# Set the working directory in the container


# Copy the JAR file into the container at /app
COPY target/account-service-0.0.1-SNAPSHOT.jar account.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 8090

# Define any environment variables your application needs (optional)
# ENV SPRING_PROFILES_ACTIVE=production

# Command to run your application
CMD ["java", "-jar", "account.jar"]