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
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
RUN mvn package
CMD ["java","-jar","Amazon.war"]
