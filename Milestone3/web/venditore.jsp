<%-- 
    Document   : venditore_autenticato
    Created on : 12-mag-2016, 16.13.05
    Author     : mattia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Venditore</title>
        <meta charset="UTF-8">
        <meta name="keyword" content="venditore,pezzi,prezzo,immagine,descrizione, milestone3,AMM">
        <meta name="description" content="venditore.html della milestone n°3">
        <meta name="author" content="Mattia Muscas">
        <link href="CSS/newcss.css" rel="stylesheet" type="text/css" media="screen"/>
    </head>
    <body>
    <page>
        <sidebar>
            <ul class="sideBar">
                <li><a class="sideBar" href="descrizione.html">Descrizione</a></li>
                <li><a class="sideBar" href="login.html">Login</a></li>
            </ul>
        </sidebar>
        <!-- id e name sono uguali, ma non devono esserlo per forza.
        Il collegamento  tra label e e input avviene tramire for e id, devono
        essere uguali. Il campo value è per inserire il valore iniziale -->
        <sidebar2>
            <h3 class="sideBar2">Marche delle nostre auto</h3>
            <img class="sideBar2" title="logo" alt="logo macchina" src="images/logo.png" width="50" height="50">
            <img class="sideBar2" title="logo2" alt="logo macchina2" src="images/logo2.png" width="60" height="50">
            <img class="sideBar2" title="logo3" alt="logo macchina3" src="images/logo3.png" width="50" height="50">
            <img class="sideBar2" title="logo4" alt="logo macchina4" src="images/logo4.png" width="50" height="60">
            <img class="sideBar2" title="logo5" alt="logo macchina5" src="images/logo5.png" width="50" height="60">
        </sidebar2>
        <header>
        <c:if test="${Username == null && Password == null}">
                <p class="errore"> Utente non autenticato     
        </c:if>  
        <h3>Bentornato, ${Venditore.nome} ${Venditore.cognome}</h3>
            
            <h1>Inserisci oggetto</h1>
            <!-- inserisco le label all'interno di una lista non ordinata -->
        </header>
        <content>
            <form action="venditore" method="GET">
                <label for="nome">Nome</label>
                <input type="text" name="nome" id="nome" value="">
                <label for="prezzo">Prezzo</label>
                <input type="number" name="prezzo" id="prezzo" value="">
                <label for="nRuote">N°Ruote</label>
                <select name="nRuote">
                    <option value="2">2</option>
                    <option value="4">4</option>
                </select>
                <label for="colore">Colore</label>
                <input type="text" name="colore" id="colore" value="">
                <label for="cilindrata">Cilindrata</label>
                <input type="number" name="cilindrata" id="cilindrata" value="">
                <label for="immagine">URL Immagine</label>
                <input type="text" name="immagine">
                <label for="descrizione">Descrizione</label>
                <!-- textarea specifica le righe (rows) e il numero di caratteri
                per riga (cols). Può essere estesa cliccanco nell'angolo in basso
                a destra e trascinandolo con il mouse-->
                <textarea rows="2" cols="50" name="descrizione" id="descrizione" value=""></textarea></li>
                <!-- bottono per la conferma delle informazioni inserite. Per ora
                ricopre solo un ruolo "estetico" e non funzionale-->
                <div>
                    <button class="ok" type="submit">CONFERMA</button>
                </div>
                
            </form>
        </content>
        <!-- link alle pagine descrizione.html e login.html -->
        <footer class="footerVenditore">
            <hr class="hr">
        <p> (C.E.) noi con voi ...
        </footer>
    </page>
    </body>
</html>
