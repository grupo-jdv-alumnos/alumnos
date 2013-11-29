<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>

    </head>
    <body>
        <table>
            <tr>
                <td class="titulo"><h2>Mantenimiento de Alumnos</h2></td>              
            </tr>
        </table>
        <table class="tabla">
            <tr>
                <th>Nombres</th>
                <th>Apellido Paterno</th>
                <th>Apellido Materno</th>
                <th>Correo</th>
                <th>Movil</th>
                <th>Promedio</th>
                <th>Carrera</th>
                <th>Genero</th>
                <th>Accion</th>
            </tr>
            <s:iterator value="alumnos">
                <tr>
                    <td><s:property value="nombres"/></td>
                    <td><s:property value="appaterno"/></td>
                    <td><s:property value="apmaterno"/></td>
                    <td><s:property value="correo"/></td>
                    <td><s:property value="movil"/></td>
                    <td><s:property value="promedio"/></td>
                    <td><s:property value="carrera"/></td>
                    <td><s:property value="genero"/></td>
                    <td><a href="eliminarAlumno?id=<s:property value="codigo"/>">Eliminar</a></td>
                     <td><a href="cargarAlumno?id=<s:property value="codigo"/>">Modificar</a></td>
                </tr>
            </s:iterator>
        </table>
        <a href="nuevoAlumno">Agregar nuevo alumno</a>
    </body>
</html>
