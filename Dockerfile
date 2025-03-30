FROM docker.io/tomcat:latest
LABEL authors="drewi"

COPY ./build/libs/ba2api.war /usr/local/tomcat/webapps/
CMD ["catalina.sh", "run"]