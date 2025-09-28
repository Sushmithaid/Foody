package com.tap.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tap.connector.connector_factory;
import com.tap.dao.UserDAO;
import com.tap.model.User;

public class UserDAOImpl implements UserDAO
{

	public Connection con;
	public Statement stmt;
	public PreparedStatement pstmt;
		
	String getAllDetails = "select * from user";
	
	String getSpeificDetails = "select * from user where id=?";
	
	String insert = "insert into user(id,name,username,password,email,phone,address)"
			+ "values(?,?,?,?,?,?,?)";
	
	String update = "update user set name=?,username=?,password=?,email=?,phone=?,address=? where id=?";
	
	String delete = "delete from user where id=?";
	
	
	
	
	@Override
	public List getAllUserDetails() 
	{
		ArrayList<User> al=null;
		try
		{
			con=connector_factory.requestConnection();
			stmt=con.createStatement();
			ResultSet result=stmt.executeQuery(getAllDetails);
			al=new ArrayList<>();
			while(result.next()==true)
			{
				User user=new User(result.getInt(1),result.getString(2),result.getString(3),
						result.getString(4),result.getString(5),result.getString(6),result.getString(7));
				
				al.add(user);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
	}

	@Override
	public User getSpecificDetails(int id) 
	{
		User user=null;
		try
		{
			con=connector_factory.requestConnection();
			pstmt=con.prepareStatement(getSpeificDetails);
			pstmt.setInt(1, id);
			ResultSet result=pstmt.executeQuery();
			while(result.next()==true)
			{
				user=new User(result.getInt(1),result.getString(2),result.getString(3),
						result.getString(4),result.getString(5),result.getString(6),result.getString(7));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean insert_user(User user) 
	{
		int res=0;
		try
		{
			con=connector_factory.requestConnection();
			pstmt=con.prepareStatement(insert);
			pstmt.setInt(1, user.getId());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getUsername());
			pstmt.setString(4, user.getPassword());
			pstmt.setString(5, user.getEmail());
			pstmt.setString(6, user.getPhone());
			pstmt.setString(7, user.getAddress());
			
			res=pstmt.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(res==1)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean update_user(User user) 
	{
		int res=0;
		try
		{
			con=connector_factory.requestConnection();
			pstmt=con.prepareStatement(update);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, user.getPassword());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getPhone());
			pstmt.setString(6, user.getAddress());
			pstmt.setInt(7, user.getId());
			
			res=pstmt.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(res==1)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean delete_user(int id) 
	{
		int res=0;
		try
		{
			con=connector_factory.requestConnection();
			pstmt=con.prepareStatement(delete);
			pstmt.setInt(1, id);
			res=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(res==1)
		{
			return true;
		}
		return false;
	}
	

}
