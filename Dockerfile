# Use OpenJDK 17 as the base image
FROM openjdk:17

# Copy the JAR file into the container
COPY ./target/cal-1.0.0-jar-with-dependencies.jar ./

# Set the working directory
WORKDIR ./

# Run the JAR file
CMD ["java", "-jar", "cal-1.0.0-jar-with-dependencies.jar"]
