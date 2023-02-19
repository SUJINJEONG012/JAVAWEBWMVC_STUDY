package org.sujin.w1.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Get 방식 호출

@WebServlet(name="inputController", urlPatterns="/calc/input")
public class CalcInputController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException , IOException {
		System.out.println("InputController...doGet");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/calc/input.jsp");
		dispatcher.forward(req, resp);
		
	}
	
}
