<%-- 
    Document   : login
    Created on : 11-mag-2016, 18.22.06
    Author     : mattia
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="keyword" content="login,password, milestone3,AMM">
        <meta name="description" content="login.html della milestone n°3">
        <meta name="author" content="Mattia Muscas">
        <link href="CSS/newcss.css" rel="stylesheet" type="text/css" media="screen"/>
    </head>
     
    <body>
     
    <page>    
    <sidebar>
        <ul class="sideBar">
            <li><a class="sideBar" href="descrizione.html">Descrizione</a></li>
            <li><a class="sideBar" href="cliente.html">Cliente</a></li>
            <li><a class="sideBar" href="venditore.html">Venditore</a></li>
        </ul>
    </sidebar>
    <sidebar2>
        <h3 class="sideBar2">Marche delle nostre auto</h3>
        <img class="sideBar2" title="logo" alt="logo macchina" src="images/logo.png" width="50" height="50">
        <img class="sideBar2" title="logo2" alt="logo macchina2" src="images/logo2.png" width="60" height="50">
        <img class="sideBar2" title="logo3" alt="logo macchina3" src="images/logo3.png" width="50" height="50">
        <img class="sideBar2" title="logo4" alt="logo macchina4" src="images/logo4.png" width="50" height="60">
        <img class="sideBar2" title="logo5" alt="logo macchina5" src="images/logo5.png" width="50" height="60">
    </sidebar2>
        <content>
        <header>
        <h1>Login</h1>
        </header>
            <c:if test="${Username == null || Password == null}">
                <p class="errore"> username o password errati ... Riprovare     
            </c:if>
            <p class="testo">Inserire username e password:
        <!-- form per l'inserimento dello username e password all'interno di
        una lista non ordinata -->
        <!-- method=post perchè altrimenti i dati inseriti, compresa la 
        password sarebbero visibili nell'indirizzo della pagina.
        Cosa poco sicura -->
        <form action="login" method="post">
            <div id="sez_login">
                <label for="username">Username</label>
                <input type="text" name="username" id="username" value="">
                <label for="password">Password</label>
            <!-- il tipo password oscura i caratteri inseriti -->
                <input type="password" name="password" id="password" value="">
                <input type="submit" name="Submit" value="login">
            </div>
        </form>
        </content>
        <footer class="footerLogin">
            <hr class="hr">
            <p class="testoFooter"> (C.E.) noi con voi ...
        </footer>
    </page>
    </body>
</html>
