<%-- 
    Document   : formInsertar
    Created on : 06-05-2020, 06:20:40 PM
    Author     : rey
--%>

<%@page import="clases.Alumno"%>
<%@page import="java.sql.ResultSet"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link rel="stylesheet" href="estyles.css">
    <title>Document</title>
</head>

    <% Alumno alum = new Alumno();
    alum.conectar();%>
<body class="row justify-content-center">
    
  <div class="w-25 row border border-dark justify-content-center mt-5">
    <form action="insertarAlumno" method="post" class="my-4 col-10">

      

      <div class="form-group border border-dark p-2">
        <label for="">NOMBRE</label>
        <input type="text" class="form-control" id="txtnombre" name="txtnombre" aria-describedby="emailHelp" required>       
      </div>

      <div class="form-group border border-dark p-2">
        <label for="">APELLIDO</label>
        <input type="text" class="form-control" id="txtapellido" name="txtapellido" aria-describedby="emailHelp" required>       
      </div>

      <div class="form-group border border-dark p-2">
        <label for="">EDAD</label>
        <input type="text" class="form-control" id="txtedad" name="txtedad" aria-describedby="emailHelp" required>       
      </div>

      <div class="form-group border border-dark p-2">
        <label for="">CARNET</label>
        <input type="text" class="form-control" id="txtcarnet" name="txtcarnet" aria-describedby="emailHelp" required>       
      </div>
      
      <button type="submit" class="btn btn-dark col-12">ENVIAR DATOS</button>
    </form>
      
  </div>


    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>

