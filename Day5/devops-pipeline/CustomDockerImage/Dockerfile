FROM ubuntu:latest
MAINTAINER Jeganathan Swaminathan <jegan@tektutor.org>

RUN apt update && apt install -y openjdk-17-jdk
RUN apt update && apt install -y maven git

ENV JAVA_HOME /usr/lib/jvm/java-17-openjdk-amd64

ENV M2_HOME /usr/share/maven

ENV PATH $JAVA_HOME/bin:$M2_HOME/bin:$PATH

COPY settings.xml /usr/share/maven/conf/settings.xml
