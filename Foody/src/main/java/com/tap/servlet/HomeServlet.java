package com.tap.servlet;

import java.io.IOException;
import java.util.List;

import com.tap.daoImpl.RestaurantDAOImpl;
import com.tap.model.Restaurant;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/restaurant")
public class HomeServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("home servlet");
		
		RestaurantDAOImpl restImpl = new RestaurantDAOImpl();
		
		List<Restaurant> allRestaurant = restImpl.getAllRestaurentDetails();
		
		req.setAttribute("restaurant", allRestaurant);
		
		RequestDispatcher rd = req.getRequestDispatcher("restaurant.jsp");
		rd.forward(req, resp);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
