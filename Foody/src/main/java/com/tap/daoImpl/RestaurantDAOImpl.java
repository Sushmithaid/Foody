package com.tap.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tap.connector.connector_factory;
import com.tap.dao.RestaurantDAO;
import com.tap.model.Restaurant;

public class RestaurantDAOImpl implements RestaurantDAO
{

	public Connection con;
	public Statement stmt;
	public PreparedStatement pstmt;
	
	String getAllDetails = "select * from restaurant";
	
	String getSpecificDetails = "select * from restaurant where rest_id=?";
	
	String insert = "insert into restaurant(rest_id,name,address,"
			+ "phone,rating,cusineType,isActive,"
			+ "eta,id) values(?,?,?,?,?,?,?,?,?)";
	
	String update =  "update restaurant set name=?, address=?, phone=?, rating=?, cusineType=?, isActive=?, eta=?"
			+ "where rest_id=?";
	
	String delete = "delete from restaurant where rest_id=?";
	

	@Override
	public List getAllRestaurentDetails() 
	{
		ArrayList<Restaurant> al=null;
		try
		{
			con=connector_factory.requestConnection();
			stmt=con.createStatement();
			ResultSet result = stmt.executeQuery(getAllDetails);
			al=new ArrayList<Restaurant>();
			while(result.next()==true)
			{
				Restaurant res=new Restaurant(result.getInt(1),result.getString(2),result.getString(3),
						result.getString(4),result.getString(5),result.getString(6),result.getString(7),
						result.getString(8),result.getInt(9),result.getString(10));
				
				al.add(res);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
	}

	@Override
	public Restaurant getSpecificDetails(int rest_id) 
	{
		Restaurant rest=null;
		try
		{
			con=connector_factory.requestConnection();
			pstmt=con.prepareStatement(getSpecificDetails);
			pstmt.setInt(1, rest_id);
			ResultSet result = pstmt.executeQuery();
			while(result.next()==true)
			{
				rest=new Restaurant(result.getInt(1),result.getString(2),result.getString(3),
						result.getString(4),result.getString(5),result.getString(6),result.getString(7),
						result.getString(8),result.getInt(9),result.getString(10));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return rest;
	}

	@Override
	public boolean insert_Restaurent(Restaurant rest) 
	{
		int result=0;
		try
		{
			con=connector_factory.requestConnection();
			pstmt=con.prepareStatement(insert);
			pstmt.setInt(1, rest.getRest_id());
			pstmt.setString(2, rest.getName());
			pstmt.setString(3, rest.getAddress());
			pstmt.setString(4, rest.getPhone());
			pstmt.setString(5, rest.getRating());
			pstmt.setString(6, rest.getCusineType());
			pstmt.setString(7, rest.getIsActive());
			pstmt.setString(8, rest.getEta());
			pstmt.setInt(9, rest.getId());
			
			result = pstmt.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(result==1)
		{
			return true;
		}
		return false;
			
	}

	@Override
	public boolean update_Restaurant(Restaurant rest) 
	{
		int res=0;
		try
		{
			con=connector_factory.requestConnection();
			pstmt=con.prepareStatement(update);
			pstmt.setString(1, rest.getName());
			pstmt.setString(2, rest.getAddress());
			pstmt.setString(3, rest.getPhone());
			pstmt.setString(4, rest.getRating());
			pstmt.setString(5, rest.getCusineType());
			pstmt.setString(6, rest.getIsActive());
			pstmt.setString(7, rest.getEta());
			pstmt.setInt(8, rest.getRest_id());
			
			res = pstmt.executeUpdate();
			
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
	public boolean delet_Restaurent(int res_id) 
	{
		int res=0;
		try
		{
			con=connector_factory.requestConnection();
			pstmt=con.prepareStatement(delete);
			
			pstmt.setInt(1, res_id);
			
			res = pstmt.executeUpdate();
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
