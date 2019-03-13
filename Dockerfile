FROM tomcat:8.5.38-alpine
MAINTAINER arunangsu9362@gmail.com

ENV CATALINA_HOME /usr/local/tomcat
ENV PATH $CATALINA_HOME/bin:$PATH
RUN mkdir -p "$CATALINA_HOME"
WORKDIR $CATALINA_HOME

ADD target/MavenDockerApp.war $CATALINA_HOME/webapps/ 

EXPOSE 8080
CMD ["catalina.sh", "run"]
