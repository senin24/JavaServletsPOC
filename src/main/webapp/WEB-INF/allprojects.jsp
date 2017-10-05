<%--
  Created by IntelliJ IDEA.
  User: root2
  Date: 05.10.2017
  Time: 1:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Calendar" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>${initParam.title}</title>
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="metro-bootstrap-master/css/metro-bootstrap.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<c:import url="_header.jsp" var="_header"/>
${_header}
<section class="main container-fluid">
    <%
        Calendar calendar = Calendar.getInstance();
    %>
    <div class="container">
        <h1>All Projects</h1>
        <div class="row-fluid">
            <div class="col-md-3">
                <%= calendar.getTime().toString() %>
            </div>
            <div class="col-md-9">
                <ul class="nav nav-tabs">
                </ul>
                <tabset>
                    <tab heading="Search">
                        <div>
                            <c:forEach items="${app.projects}" var="project">
                                <li><a href="/${initParam.root}/${project.name}" data-toggle="tab">${project.name}</a></li>
                            </c:forEach>
                        </div>
                    </tab>
                    <tab heading="Next">
                        Some static content
                    </tab>
                </tabset>
            </div>
        </div>
    </div>
</section>
<script src="bootstrap/js/bootstrap.js"></script>
</body>
</html>
