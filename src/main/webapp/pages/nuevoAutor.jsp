<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>


    </head>

    <body>
        <h2>Nuevo Autor</h2>

        <s:form action="guardarAutor">
            <s:textfield label="Nombres" name="autor.nombres"/>
            <s:textfield label="Apellido Paterno" name="autor.apePaterno"/>
            <s:textfield label="Apellido Materno" name="autor.apeMaterno"/>
            <s:submit value="Guardar"/>
        </s:form>

    </body>
</html>
