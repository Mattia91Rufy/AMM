/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone3;

import amm.milestone3.classi.Error;
import amm.milestone3.classi.Utente;
import amm.milestone3.classi.Cliente;
import amm.milestone3.classi.Venditore;
import amm.milestone3.classi.Oggetti_in_vendita;
import amm.milestone3.classi.Saldo_Clienti;
import amm.milestone3.classi.Saldo_Venditore;
import amm.milestone3.classi.UtentiFactory;
import amm.milestone3.classi.Auto;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mattia
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session=request.getSession(true);
        if(request.getParameter("Submit") != null)
        {
            // Preleva i dati inviati
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            ArrayList<Utente> ListaUtenti = UtentiFactory.getInstance().getUtentiList();
            
            for(Utente u : ListaUtenti)
            {
                if(u.getUsername().equals(username) &&
                   u.getPassword().equals(password))
                {
                    session.setAttribute("loggedIn",true);
                    session.setAttribute("id", u.getId());
                    
                    if(u instanceof Venditore) 
                    {
                        request.setAttribute("Venditore", u);     
                        request.setAttribute("ListaVenditori", UtentiFactory.getInstance().getVenditoriList());
                        request.getRequestDispatcher("venditore.jsp").forward(request, response);
                    }
                    else
                    {
                        request.setAttribute("Cliente", u);
                        request.setAttribute("ListaClienti", UtentiFactory.getInstance().getClientiList());
                        request.setAttribute("ListaAuto", UtentiFactory.getInstance().getAutoList());
                        request.getRequestDispatcher("cliente.jsp").forward(request, response);  
                    } 
                }
            }
            
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    

}
