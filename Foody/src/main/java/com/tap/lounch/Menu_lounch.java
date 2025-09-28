package com.tap.lounch;

import java.util.List;
import java.util.Scanner;

import com.tap.daoImpl.MenuDAOImpl;
import com.tap.model.Menu;

public class Menu_lounch 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	//getAllMenuDetails
	MenuDAOImpl menuImpl=new MenuDAOImpl();
	Menu menu=new Menu();
	List<Menu> list=menuImpl.getAllMenuDetails();
	for(Menu x:list)
	{
		System.out.println(x);
	}
	
	//getSpecifiDetails
	System.out.println("..getSpecifiDetails..");
	System.out.println("Enter menu ID");
	int menu_id=sc.nextInt();
	sc.nextLine();
	System.out.println(menuImpl.getSpecificDetails(menu_id));
	
	//insert
	System.out.println("..INSERTION..");
	System.out.println("Enter menu ID");
	menu.setMenu_id(sc.nextInt());
	sc.nextLine();
	System.out.println("Enter restaurant ID");
	menu.setRest_id(sc.nextInt());
	sc.nextLine();
	System.out.println("Enter Item Name");
	menu.setItemName(sc.nextLine());
	System.out.println("Enter Price");
	menu.setPrice(sc.nextLine());
	System.out.println("Enter rating");
	menu.setRating(sc.nextLine());
		
	System.out.println(menuImpl.insert_menu(menu));
	
	//update
	System.out.println("..UPDATE..");
	System.out.println("Enter Item Name");
	menu.setItemName(sc.nextLine());
	System.out.println("Enter Price");
	menu.setPrice(sc.nextLine());
	System.out.println("Enter rating");
	menu.setRating(sc.nextLine());
	System.out.println("Enter menu ID");
	menu.setMenu_id(sc.nextInt());
	
	System.out.println(menuImpl.update_menu(menu));
	
	//delete
	System.out.println("..Delete..");
	System.out.println("Enter menu ID");
	int id=sc.nextInt();
	
	System.out.println(menuImpl.delete_menu(id));
	
	
	//getallMenu
	System.out.println("..GETTING SEPECIFIC DETAILS OF THE RESTAURANT..");
	System.out.println("Enter rest_id");
	int rest_id=sc.nextInt();
	sc.nextLine();
	System.out.println(menuImpl.getAllMenu(rest_id));
	
	
		

	

}}
