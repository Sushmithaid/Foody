package com.tap.servlet;

import java.io.IOException;
import java.util.List;

import com.tap.daoImpl.MenuDAOImpl;
import com.tap.model.Menu;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/menuuss")
public class menuServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("menu Servlet");
		
		int rest_id=Integer.parseInt(req.getParameter("restaurantId"));
		
		System.out.println(rest_id);
		
		MenuDAOImpl menuDaoImpl = new MenuDAOImpl();
		
		List<Menu> menuList = menuDaoImpl.getAllMenu(rest_id);
		
		req.setAttribute("menus", menuList);
		
		RequestDispatcher rd = req.getRequestDispatcher("menuuss.jsp");
		
		rd.forward(req, resp);
		
		
		
		
		
		
	}

}
