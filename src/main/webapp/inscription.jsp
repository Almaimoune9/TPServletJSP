<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription</title>
</head>
<body>
<form action="MonServlet" method="Post" >
  <div>
    <label >Nom</label>
    <input type="text" name="nom" >
  </div>
  <div>
    <label > Prenom </label>
    <input type="text" name="prenom"  >
  </div>
  <div >
    <label > Pseudo </label>
    <input type="text" name="pseudo" >
  </div>
  <div >
    <label > Email </label>
    <input type="email" name="email">
  </div>
  <div >
    <label>Mot de pass</label>
    <input type="password" name="motdepass"  >
  </div>
  <div >
    <input type="submit" value="Subscribe!">
  </div>
</form>
</body>
</html>