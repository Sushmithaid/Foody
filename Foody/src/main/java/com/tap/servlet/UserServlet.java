package com.tap.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.tap.connector.connector_factory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/sign-up")
public class UserServlet extends HttpServlet
{
	private Connection con;
	private PreparedStatement pstmt;
	private int res;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name=req.getParameter("name");
		String username=req.getParameter("username");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String phone=req.getParameter("phone");
		String address=req.getParameter("address");
		
		try
		{
			con=connector_factory.requestConnection();
			String insert = "insert into user(name,username,email,password,phone,address) values(?,?,?,?,?,?)";
			pstmt=con.prepareStatement(insert);
			pstmt.setString(1, name);
			pstmt.setString(2, username);
			pstmt.setString(3, email);
			pstmt.setString(4, password);
			pstmt.setString(5, phone);
			pstmt.setString(6, address);
			
			res=pstmt.executeUpdate();
			
			if(res>0)
			{
				HttpSession session = req.getSession();
                session.setAttribute("userEmail", email);
                session.setAttribute("userName", password);
				resp.sendRedirect("login.jsp");
				return;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
