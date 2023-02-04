FROM openjdk:13-jdk-alpine
ADD target/womenempowerment.jar womenempowerment.jar
ENTRYPOINT ["java","-jar","womenempowerment.jar"]