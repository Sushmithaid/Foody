package com.tap.lounch;

import java.util.List;
import java.util.Scanner;

import com.tap.daoImpl.RestaurantDAOImpl;
import com.tap.model.Restaurant;

public class Restaurant_lounch 
{
	@SuppressWarnings("null")
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		//getAllRestaurentDetails
		RestaurantDAOImpl restImpl= new RestaurantDAOImpl();
		Restaurant rest=new Restaurant();
		List<Restaurant> list= restImpl.getAllRestaurentDetails();
		for(Restaurant x:list)
		{
			System.out.println(x);
		}
		
		//getSpecificDetails
		System.out.println("..GETTING SEPECIFIC DETAILS OF THE RESTAURANT..");
		System.out.println("Enter rest_id");
		int rest_id=sc.nextInt();
		sc.nextLine();
		System.out.println(restImpl.getSpecificDetails(rest_id));
		
		//insert
		System.out.println("..Insertion..");
		System.out.println("Enter Restaurant ID");
		rest.setRest_id(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Restaurant name");
		rest.setName(sc.nextLine());
		System.out.println("Enter Restaurant address");
		rest.setAddress(sc.nextLine());
		System.out.println("Enter Restaurant phone");
		rest.setPhone(sc.nextLine());
		System.out.println("Enter Restaurant rating");
		rest.setRating(sc.nextLine());
		System.out.println("Enter Restaurant CusineType");
		rest.setCusineType(sc.nextLine());
		System.out.println("Enter Restaurant isActive");
		rest.setIsActive(sc.nextLine());
		System.out.println("Enter Restaurant Eta");
		rest.setEta(sc.nextLine());
		System.out.println("Enter user ID");
		rest.setId(sc.nextInt());
		sc.nextLine();
	
		System.out.println(restImpl.insert_Restaurent(rest));
		
		//update
		System.out.println("..UPDATE..");
		
		System.out.println("update Restaurant name");
		rest.setName(sc.nextLine());
		System.out.println("update Restaurant address");
		rest.setAddress(sc.nextLine());
		System.out.println("update Restaurant phone");
		rest.setPhone(sc.nextLine());
		System.out.println("update Restaurant rating");
		rest.setRating(sc.nextLine());
		System.out.println("update Restaurant cusineType");
		rest.setCusineType(sc.nextLine());
		System.out.println("update Restaurant isActive");
		rest.setIsActive(sc.nextLine());
		System.out.println("update Restaurant Eta");
		rest.setEta(sc.nextLine());
		System.out.println("update Restaurant ID");
		rest.setRest_id(sc.nextInt());
		
		System.out.println(restImpl.update_Restaurant(rest));
		
		//delete
		System.out.println("..DELETE..");
		System.out.println("Enter the Restaurent ID for deletion");
		int delete=sc.nextInt();
		System.out.println(restImpl.delet_Restaurent(delete));
			

	}

}
