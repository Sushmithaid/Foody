package com.tap.dao;

import java.util.List;

import com.tap.model.Menu;

public interface MenuDAO 
{
	List getAllMenuDetails();
	
	Menu getSpecificDetails(int menu_id);
	
	boolean insert_menu(Menu menu);
	
	boolean update_menu(Menu menu);
	
	boolean delete_menu(int menu_id);
	
	List<Menu> getAllMenu(int rest_id);

}
