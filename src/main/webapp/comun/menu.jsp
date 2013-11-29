<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<ul class="menu">
    <li>
        <a href="<c:url value="/j_spring_security_logout" />" > Salir</a>
    </li>

    <li>
        <a href="<c:url value="/alumnosList" />" > Mantenimiento Alumnos</a>
    </li>

    <li>
        <a href="<c:url value="/admin/usuariosList" />" > Mantenimiento Usuarios</a>
    </li>

    <li>
        <a href="<c:url value="/admin/rolesList" />" > Mantenimiento Roles</a>
    </li>

    <li>
        <a href="<c:url value="/autorList" />" > Mantenimiento Autores</a>
    </li>




</ul>   
