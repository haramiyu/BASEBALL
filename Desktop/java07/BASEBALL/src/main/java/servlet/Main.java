package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserName;


@WebServlet("/Main")
public class Main extends HttpServlet {
private static final long serialVersionUID = 1L;
       
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	UserName us = new UserName();
	String[] names = {us.getName(),us.getName2(),us.getName3()};
	
	int index = (int)(Math.random()*3);
	String team = names[index];
	
	request.setAttribute("team", team);
	
	
    RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main.jsp"); 
	dispatcher.forward(request,response);
	
	}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	UserName us = new UserName();
	String[] names = {us.getName(),us.getName2(),us.getName3()};
	int index = (int)(Math.random()*3);
	String team = names[index];
	request.setAttribute("team", team);
	
	
	
	
	
    RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main.jsp"); 
	dispatcher.forward(request,response);
}

}
	