<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>


    </head>

    <body>
        <h2>Alumno</h2>

        <s:form action="guardarAlumno">
            <s:textfield label="Nombres" name="alumno.nombres"/>
            <s:textfield label="Apellido Paterno" name="alumno.appaterno"/>
            <s:textfield label="Apellido Materno" name="alumno.apmaterno"/>
            <s:textfield label="correo" name="alumno.correo"/>
            <s:textfield label="movil" name="alumno.movil"/>
            <s:textfield label="promedio" name="alumno.promedio"/>
            <s:select label="Carrera" 
                      list="#{'Sistemas':'Sistemas', 'Elesctronica':'Electronica', 'Industrial':'Industrial'}" 
                      name="alumno.carrera" />  

            <s:select label="Genero" 
                      list="#{'Masculino':'Masculino', 'Femenino':'Femenino'}" 
                      name="alumno.genero" />              
            <s:submit value="Guardar"/>
        </s:form>
        <s:actionmessage/>

    </body>
</html>
