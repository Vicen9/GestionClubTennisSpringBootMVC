<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Edita Socio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

</head>
<body class="container">
<main class="row">

    <section class="col-md-6">
        <h1>Editar Socio</h1>
        <form:form method="POST" class="well" modelAttribute="socio">
            <h3>ID SOCIO ${socio.idSocio}</h3>

            <form:label path="idSocio" >ID:</form:label><form:input class='form-control' path="idSocio" />
            <div><form:errors cssClass="form-text text-danger" path="idSocio"/></div>

            <form:label path="nombre" >Nombre:</form:label><form:input class='form-control' path="nombre" />
            <div><form:errors cssClass="form-text text-danger" path="nombre"/></div>

            <form:label path="apellidos" >Apellidos:</form:label><form:input class='form-control' path="apellidos" />
            <div><form:errors cssClass="form-text text-danger" path="apellidos"/></div>


            <form:label path="dni">DNI:</form:label><form:input class='form-control' path="dni" />
            <div><form:errors cssClass="form-text text-danger" path="dni"/></div>

            <form:label path="telefono">Telefono:</form:label><form:input class='form-control' path="telefono" />
            <div><form:errors cssClass="form-text text-danger" path="telefono"/></div>

            <form:label path="direccion">Direccion:</form:label><form:input class='form-control' path="direccion" />
            <div><form:errors cssClass="form-text text-danger" path="direccion"/></div>

            <form:label path="fechaNacimiento">Fecha Nacimiento:</form:label><form:input class='form-control' path="fechaNacimiento" />
            <div><form:errors cssClass="form-text text-danger" path="fechaNacimiento"/></div>

            <form:label path="email">Email:</form:label><form:input class='form-control' path="email" />
            <div><form:errors cssClass="form-text text-danger" path="email"/></div>

            <form:label path="nivel">Nivel:</form:label><form:input class='form-control' path="nivel" />
            <div><form:errors cssClass="form-text text-danger" path="nivel"/></div>


            <form:label  path="sexo">Sexo:</form:label>
            <form:input class='form-control'  path="sexo"/>
            <div><form:errors cssClass="form-text text-danger" path="sexo"/></div>

            <form:label path="mediodePago">Medio de Pago:</form:label><form:input class='form-control' path="mediodePago" />
            <div><form:errors cssClass="form-text text-danger" path="mediodePago"/></div>

            <p>
                <input name="enviar" type="Submit" value="Guardar" class="btn btn-primary">
                <input name="enviar" type="reset" value="Limpiar" class="btn btn-default">
                <a class="btn btn-default" href="/tennis">Volver</a>
            </p>
        </form:form>
    </section>
</main>

</body>
</html>
