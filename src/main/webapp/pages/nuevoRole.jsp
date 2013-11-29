<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>


    </head>

    <body>
        <h2>Nuevo Role</h2>

        <s:form action="guardarRole">
            <s:textfield label="Nombres" name="role.name"/>
            <s:submit value="Guardar"/>
        </s:form>

    </body>
</html>
