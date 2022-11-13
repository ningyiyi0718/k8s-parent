FROM java:8

LABEL maintainer="yyy"

ADD gateway/target/gateway.jar     gateway.jar

EXPOSE  88

ENTRYPOINT    ["java","-jar","-Xms256m","-Xmx512m","-XX:PermSize=256M","-XX:MaxPermSize=512M","/gateway.jar"]