<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bloqueado a nivel HTTP</title>
    </head>
    <body>
        <h2>Usted, No tiene permisos para acceder a esta página</h2><br>
        <a href="<c:url value="/j_spring_security_logout" />" > Logout</a>
    </body>
</html>
