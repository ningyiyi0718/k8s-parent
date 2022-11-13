FROM java:8

LABEL maintainer="yyy"

ADD service-one/target/service-one.jar     service-one.jar

EXPOSE  8000

ENTRYPOINT    ["java","-jar","-Xms256m","-Xmx512m","-XX:PermSize=256M","-XX:MaxPermSize=512M","/service-one.jar"]