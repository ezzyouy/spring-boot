<%--
  Created by IntelliJ IDEA.
  User: Sofia BOUAGRA
  Date: 20/03/2021
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<f:form modelAttribute="key" action="${pageContext.request.contextPath}/clients/id" method="post">
    <f:hidden path="id"/>
    <label>Cin</label>
    <f:input path="cin" maxlength="123"/>
    <label>nom</label>
    <f:input path="nom" maxlength="123"/>
</f:form>
</body>
</html>
