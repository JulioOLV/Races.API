FROM maven:3.8.3-openjdk-17

WORKDIR /bezkoder-app
COPY . .
RUN mvn clean install

WORKDIR /races-service

CMD mvn spring-boot:run