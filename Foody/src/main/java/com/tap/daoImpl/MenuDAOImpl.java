package com.tap.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tap.connector.connector_factory;
import com.tap.dao.MenuDAO;
import com.tap.model.Menu;
import com.tap.model.Restaurant;

public class MenuDAOImpl implements MenuDAO
{

	public Connection con;
	public Statement stmt;
	public PreparedStatement pstmt;
	String getAllDetails = "select * from menu";
	
	String getSpecificDetails = "select * from menu where menu_id=?";
	
	String insert = "insert into menu(menu_id,rest_id,itemName,price,rating) values(?,?,?,?,?)";
	
	String update = "update menu set itemName=?,price=?,rating=? where menu_id=?";
	
	String delete = "delete from menu where menu_id=?";
	
	String getAllMenu = "select * from menu where rest_id=?";
	
	

	@Override
	public List getAllMenuDetails() 
	{
		ArrayList<Menu> al=null;
		try
		{
			con=connector_factory.requestConnection();
			stmt=con.createStatement();
			ResultSet result=stmt.executeQuery(getAllDetails);
			al=new ArrayList<Menu>();
			while(result.next()==true)
			{
				Menu menu=new Menu(result.getInt(1),result.getInt(2),
				result.getString(3),result.getString(4),result.getString(5),result.getString(6));
				
				al.add(menu);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
	}

	@Override
	public Menu getSpecificDetails(int menu_id) 
	{
		Menu menu=null;
		try
		{
			con=connector_factory.requestConnection();
			pstmt=con.prepareStatement(getSpecificDetails);
			pstmt.setInt(1, menu_id);
			ResultSet result=pstmt.executeQuery();
			while(result.next()==true)
			{
				menu=new Menu(result.getInt(1),result.getInt(2),
						result.getString(3),result.getString(4),result.getString(5),result.getString(6));
						
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return menu;
	}

	@Override
	public boolean insert_menu(Menu menu) 
	{
		int res=0;
		try
		{
			con=connector_factory.requestConnection();
			pstmt=con.prepareStatement(insert);
			pstmt.setInt(1, menu.getMenu_id());
			pstmt.setInt(2, menu.getRest_id());
			pstmt.setString(3, menu.getItemName());
			pstmt.setString(4, menu.getPrice());
			pstmt.setString(5, menu.getRating());
						
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
	public boolean update_menu(Menu menu) 
	{
		int res=0;
		try
		{
			con=connector_factory.requestConnection();
			pstmt=con.prepareStatement(update);
			pstmt.setString(1, menu.getItemName());
			pstmt.setString(2, menu.getPrice());
			pstmt.setString(3, menu.getRating());
			pstmt.setInt(5, menu.getMenu_id());
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
	public boolean delete_menu(int menu_id) 
	{
		int res=0;
		try
		{
			con=connector_factory.requestConnection();
			pstmt=con.prepareStatement(delete);
			pstmt.setInt(1, menu_id);
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
	public List<Menu> getAllMenu(int rest_id) 
	{
		List<Menu> menuList = new ArrayList<>(); 
	    try
	    {
	        con = connector_factory.requestConnection();
	        pstmt = con.prepareStatement(getAllMenu); 
	        pstmt.setInt(1, rest_id);
	        ResultSet result = pstmt.executeQuery();
	        while (result.next())
	        {
	            Menu menu = new Menu(result.getInt(1), result.getInt(2),result.getString(3), result.getString(4),
	                result.getString(5), result.getString(6));
	            
	            menuList.add(menu);	             
	        }
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
	    
	    return menuList; 
		
	    
	}	
}
