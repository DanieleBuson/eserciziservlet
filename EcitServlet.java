package com.academy;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



import java.io.IOException;

/**
 * Servlet implementation class EcitServlet
 */
public class EcitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EcitServlet() {
        super();
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String password = request.getParameter("password");
         
        User user = new User();
        user.setNome(nome);
        user.setPassword(password);
        String destPage = "erroreindex.jsp";
        if(user.getNome().equals("daniele") && user.getPassword().equals("abcd")) { 
        	destPage = "Home.jsp";
        	RequestDispatcher rD = request.getRequestDispatcher(destPage);
        	request.setAttribute("nome", "Daniele");
        	rD.forward(request, response);
        }
        else {
        	RequestDispatcher rD = request.getRequestDispatcher(destPage);
        	rD.forward(request, response);
        }
        
    }
    
}


