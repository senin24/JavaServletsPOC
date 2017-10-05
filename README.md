# JavaServletsPOC
Simple web-app through servlets

Run web-app (IDEA + Tomcat):

* Clone project and import to IDEA as Maven project

* Install Tomcat on your PC, edit tomcat-users.xml and add:
```xml
  <role rolename="manager-gui"/>
  <role rolename="manager-script"/>
  <user username="tomcat" password="s3cret" roles="manager-gui"/>
  <user username="tomcat-script" password="s3cret" roles="manager-script"/>
```
* Open Maven tools and choose Plugins - tomcat7 - tomcat7:redeploy

* Open link in browser: http://localhost:8080/JavaServletsPOC/ 
