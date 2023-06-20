<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>
<p style="color=">Bienvenu ${param.nom} </p>
<table border="1">
<thead>
  <tr>
    <th>Nom</th>
    <th>Prenom</th>
    <th>Pseudo</th>
    <th>Email</th>
  </tr>
  </thead>
  <c:forEach items="${liste}" var = "utilisateur" varStatus="status">
  <tbody>
  <tr>
    <td>${utilisateur.nom}</td>
    <td>${utilisateur.prenom}</td>
    <td>${utilisateur.pseudo}</td>
    <td>${utilisateur.email}</td>
  </tr>
  </tbody>
   </c:forEach>
</table>
<form action="MonServlet2" method="GET">
<button>Déconnexion</button>
</form>
<!-- <a href="MonServlet2"> <button border="1">Déconnexion</button></a> -->
</body>
</html>