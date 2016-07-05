<%-- 
    Document   : cliente
    Created on : 10-mag-2016, 18.31.59
    Author     : mattia
--%>

<%@page import="amm.milestone3.classi.Auto"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cliente</title>
        <meta charset="UTF-8">
        <meta name="keyword" content="cliente,auto, milestone3,AMM">
        <meta name="description" content="cliente.html della milestone n°3">
        <meta name="author" content="Mattia Muscas">
        <link href="CSS/newcss.css" rel="stylesheet" type="text/css" media="screen"/>
    </head>
    <body>
    <page>
        <sidebar id="sideBarCliente">
            <ul class="sideBar">
            <li><a class="sideBar" href="descrizione.html">Descrizione</a></li>
            <li><a class="sideBar" href="login.html">Login</a></li>
        </ul>
        </sidebar>
        
        <header class="Cliente">
            <h1 class="Cliente">Modelli, prezzi e disponibilità</h1>
        </header>
        <!-- tramite table realizzo una tabella con 5 righe (una per ogni oggetto)
        e 6 colonne. Ogni colonna conterrà un'informazione aggiuntiva al prodotto
        in vendita -->
        <content>
             <h3>Bentornato, ${Cliente.nome} ${Cliente.cognome}</h3>
             
             
            <table class="forEach">
            <th>Auto</th>
            <th>Immagine</th>
            <th>Pezzi</th>
            <th>Prezzo</th>
            <th>Carrello</th>
            <th>Descrizione</th>
            <c:forEach var="Auto" items="${ListaAuto}">
            <!-- divido l'id della macchina per vedere se la riga è pari o dispari -->    
            <c:if test="${Auto.idCar % 2 == 0}">
                    <tr class="pari">
                </c:if>
                <c:if test="${Auto.idCar % 2 != 0}">
                    <tr class="dispari">
                </c:if>
                       
                
                <td>${Auto.modello}</td>
                <td><img title="famigliare" alt="Family_Car"
src="${Auto.image}" width="100" height="80"></td>
                <td>${Auto.pezzi}</td>
                <td>${Auto.prezzo} €</td>
                <td>
                    <button class="buttonCarr" type="submit">
                        <img src="images/carrello.png" width="50" height="50"/><strong>Aggiungi a carrello</strong></button>
                </td>
                <td><p class="testoListino">${Auto.descrizione}<p></p></td>
            </tr>
            
            </c:forEach>
        </table>
        </content>
        <footer class="footerCliente">
            <hr class ="hr">
            <p>(C.E.)Sempre con voi ...
        </page>
    </body>
</html>
