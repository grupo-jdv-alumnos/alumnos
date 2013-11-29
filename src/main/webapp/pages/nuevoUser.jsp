<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>


    </head>

    <body>
        <h2>Nuevo usuario</h2>

        <s:form action="guardarUsuario">
            <s:textfield label="Username" name="usuario.username"/>
            <s:textfield label="Password" name="usuario.password"/>
            <s:select label="Habilitado" 
                      list="#{'true':'Activo', 'false':'Inactivo'}" 
                      name="usuario.enabled" 
                      value="true" />
            <s:select label="Rol" list="roles" name="usuario.idRole" listKey="idRole" listValue="name"/>
            <s:submit value="Guardar"/>
        </s:form>

    </body>
</html>
