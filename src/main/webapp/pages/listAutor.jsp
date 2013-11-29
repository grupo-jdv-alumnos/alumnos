<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>

    </head>

    <body>
        <table>
            <tr>
                <td><h2>Mantenimiento de Autores</h2></td>          
            </tr>
        </table>
        <table>
            <tr>
                <th>Nombres</th>
                <th>Apellido Paterno</th>
                <th>Apellido Materno</th>
                <th>Accion</th>
            </tr>
            <s:iterator value="autores">
                <tr><td><s:property value="nombres"/></td>
                    <td><s:property value="apePaterno"/></td>
                    <td><s:property value="apeMaterno"/></td>
                    <td><a href="eliminarAutor?id=<s:property value="idAutor"/>">Eliminar</a></td>
                </tr>
            </s:iterator>
        </table>
        <a href="nuevoAutor">Agregar nuevo autor</a>
    </body>
</html>
