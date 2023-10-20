package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserName;


@WebServlet("/User")
public class User extends HttpServlet {
private static final long serialVersionUID = 1L;
 
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//リクエストパラメーターの取得
	request.setCharacterEncoding("UTF-8");
	HttpSession session = request.getSession();
	String name = request.getParameter("name");
	String name2 = request.getParameter("name2");
	String name3 = request.getParameter("name3");
	
	//UserNameインスタンスの生成
	UserName us = new UserName(name,name2,name3);
	
	//UserName情報をセッションスコープに保存
	session.setAttribute("name", us);
	session.setAttribute("name2",us);
	session.setAttribute("name3",us);
	
    //Main画面にフォワード
	RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main.jsp"); 
	dispatcher.forward(request,response);
	
	}

}
