<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listado</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <ul class="navbar-nav">
        <li class="nav-item"><a class="nav-link" href="/tennis">Inicio</a> </li>

        <li class="nav-item"><a class="nav-link" href="/tennis">Lista Socios</a></li>

        <li class="nav-item"></li>
    </ul>
</nav>


<h2>Lista de Socios</h2>
<nav class="col-md-3">
    <ul class=" nav nav-pills flex-column">
        <li class="nav-item"><a href='tennis/crea' class="nav-link">Nuevo Socio</a></li>
    </ul>
</nav>


<table class="table table-striped">

    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Apellidos</th>
        <th>DNI</th>
    </tr>

    <c:forEach var="s" items="${socios}">
        <c:set var="qry" value="?id=${s.idSocio}"/>
        <tr>
            <td>${s.idSocio}</td>
            <td>${s.nombre}</td>
            <td>${s.apellidos}</td>
            <td>${s.dni}</td>
            <td> <a class='btn btn-light btn-sm' href="tennis/visualiza${qry}">Ver</a></td>
            <td> <a class='btn btn-primary btn-sm' href="tennis/edita${qry}">Edita</a></td>
            <td> <a class='btn btn-danger btn-sm' href='tennis/borra${qry}'>&#x1f5d1;</a></td>
        </tr>

    </c:forEach>

</table>


</body>
</html>
