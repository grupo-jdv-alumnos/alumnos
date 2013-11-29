<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>

    </head>

    <body>
        <table>
            <tr>
                <td><h2>Mantenimiento de Usuarios</h2></td>           
            </tr>
        </table>


        <table>
            <tr>
                <th>ID</th>
                <th>Username</th>
                <th>Password</th>
                <th>Enabled</th>
                <th>Role</th>
                <th>Accion</th>
            </tr>
            <s:iterator value="usuarios">
                <tr><td><s:property value="idUser"/></td>
                    <td><s:property value="username"/></td>
                    <td><s:property value="password"/></td>
                    <td><s:property value="enabled"/></td>
                    <td><s:iterator value="roles">
                            <s:property value="name"/>
                        </s:iterator>
                    </td>
                    <td><a href="eliminarUsuario?id=<s:property value="idUser"/>">Eliminar</a></td>
                </tr>
            </s:iterator>
        </table>
        <a href="nuevoUsuario">Agregar nuevo usuario</a>
    </body>
</html>
