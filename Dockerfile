FROM openjdk:11
EXPOSE 8023
ADD target/Employee-managemet-systems.jar Employee-managemet-systems.jar
ENTRYPOINT ["java","-jar","/Employee-managemet-systems.jar"]