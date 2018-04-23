FROM java:8
RUN apt-get update
RUN apt-get install -y maven
RUN wget https://ftp.mozilla.org/pub/firefox/releases/51.0/linux-x86_64/en-US/firefox-51.0.tar.bz2
RUN tar -xjf firefox-51.0.tar.bz2
RUN mv firefox /opt/firefox51
RUN ln -s /opt/firefox51/firefox /usr/bin/firefox
RUN apt-get update && apt-get install -y \
    software-properties-common \
    unzip \
    curl \
    xvfb
RUN xvfb &
RUN curl -O http://archive.apache.org/dist/tomcat/tomcat-7/v7.0.55/bin/apache-tomcat-7.0.55.tar.gz
RUN tar xzf apache-tomcat-8.0.36.tar.gz
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
RUN mvn clean
RUN mvn package
CMD ["java","-jar","Amazon.war"]
ADD Amazon.war apache-tomcat-8.0.36/webapps/
CMD apache-tomcat-7.0.55/bin/startup.sh && tail -f apache-tomcat-7.0.55/logs/catalina.out
EXPOSE 8080