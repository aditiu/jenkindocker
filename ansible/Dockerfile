FROM tomcat:8.0-alpine
MAINTAINER Aditi Upadhyay <aditi.18.coool@gmail.com>

# Update Apt and then install Nano editor (RUN can be removed)
RUN apk update
COPY tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
COPY MyWebApp-3.8.war /usr/local/tomcat/webapps/Mywebapp.war
