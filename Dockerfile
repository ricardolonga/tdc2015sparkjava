FROM java:8-jre

EXPOSE 8080

ADD target/tdc2015sparkjava-0.1.jar /

ENTRYPOINT ["java", "-jar", "tdc2015sparkjava-0.1.jar"]

