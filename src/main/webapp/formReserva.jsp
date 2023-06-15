<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Realiza tu reserva</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<jsp:include page="navBar.html"></jsp:include>
	<div class="container">
		<div class="row">
			<div class="col">
				<h1>Datos de la reserva</h1>
				<form action="AlmacenarReserva" method="post">
					<input type="hidden" name="id_parcela" value="${parcela.id}"/>
					<table>
						<tr>
							<td>Nombre:</td>
							<td><input type="text" name="nombre" value=""/></td>
						</tr>
						<tr>
							<td>Apellido:</td>
							<td><input type="text" name="apellido" value=""/></td>
						</tr>
						<tr>
							<td>Dni:</td>
							<td><input type="text" name="dni" value=""/></td>
						</tr>
						<tr>
							<td>Numero de pesonas:</td>
							<td><input type="text" name="numero_personas" value=""/></td>
						</tr>
						<tr>
							<td>Fecha inicio:</td>
							<td><input type="text" name="fecha_inicio"
								placeholder="dd-MM-yyyy" value="" /></td>
						</tr>
						<tr>
							<td>Fecha fin:</td>
							<td><input type="text" name="fecha_fin"
								placeholder="dd-MM-yyyy" value="" /></td>
						</tr>
						<tr>
							<td>Luz</td>
							<td><input type="checkbox" name="luz" /></td>
						</tr>
					</table>
					<input class="btn btn-primary" type="submit" value="Reservar" name="reservar" />
				</form>
			</div>
			<div class="col">
				<h1>Info de la parcela reservada</h1>
				<table class="table">
					<thead>
						<tr>
							<th>numero</th>
							<th>m<sub>2</sub></th>
							<th>Precio dia</th>
						</tr>
					</thead>
					<tbody>
						
						<tr var="parcela">
								<td>${parcela.numero}</td>
								<td>${parcela.mCuadrados}</td>
								<td>${parcela.precioDia}</td>
								
								
							</tr>
							
					
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</html>