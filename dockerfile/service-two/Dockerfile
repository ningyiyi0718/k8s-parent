FROM java:8

LABEL maintainer="yyy"

ADD service-two/target/service-two.jar     service-two.jar

EXPOSE  9000

ENTRYPOINT    ["java","-jar","-Xms256m","-Xmx512m","-XX:PermSize=256M","-XX:MaxPermSize=512M","/service-two.jar"]