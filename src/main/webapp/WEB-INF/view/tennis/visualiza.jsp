<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Visualiza Cliente </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

</head>
<body class="container">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <ul class="navbar-nav">
        <li class="nav-item"><a class="nav-link" href="/tennis">Inicio</a> </li>

        <li class="nav-item"><a class="nav-link" href="/tennis">Lista Socios</a></li>

        <li class="nav-item"></li>
    </ul>
</nav>
<main class="row">

    <section class="col-md-9">
        <div class="panel panel-default">
            <h2 class="panel-heading">Datos Socio</h2>
            <ul class="panel-body list-group">
                <li class="list-group-item"><strong>ID:</strong>
                    <span class="list-group-item-text">${socio.idSocio}</span></li>
                <li class="list-group-item"><strong>Nombre:</strong> ${socio.nombre}</li>
                <li class="list-group-item"><strong>Apellido:</strong> ${socio.apellidos}</li>
                <li class="list-group-item"><strong>DNI:</strong>${socio.dni}</li>
                <li class="list-group-item"><strong>Telefono:</strong> ${socio.telefono}</li>
                <li class="list-group-item"><strong>Direccion:</strong> ${socio.direccion}</li>
                <li class="list-group-item"><strong>Email:</strong> ${socio.email}</li>
                <li class="list-group-item"><strong>Fecha Nacimiento:</strong>
                    ${socio.fechaNacimiento}
                </li>
                <li class="list-group-item"><strong>Nivel:</strong> ${socio.nivel}</li>
                <li class="list-group-item"><strong>Sexo:</strong> ${socio.sexo}</li>
                <li class="list-group-item"><strong>Medio de Pago:</strong> ${socio.mediodePago}</li>


            </ul>
        </div>
    </section>
</main>
</body>
</html>