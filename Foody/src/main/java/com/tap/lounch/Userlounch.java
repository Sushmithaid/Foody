package com.tap.lounch;

import java.util.List;
import java.util.Scanner;
import com.tap.daoImpl.UserDAOImpl;
import com.tap.model.User;

public class Userlounch 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	//getAllUserDetails
	UserDAOImpl userImpl=new UserDAOImpl();
	User user=new User();
	List<User> list=userImpl.getAllUserDetails();
	for(User x:list)
	{
		System.out.println(x);
	}
	
	//getSpecifiDetails
	System.out.println("..GETTING SEPECIFIC DETAILS OF THE USER..");
	System.out.println("Enter User ID");
	int user_id=sc.nextInt();
	sc.nextLine();
	System.out.println(userImpl.getSpecificDetails(user_id));
	
	//insert
	System.out.println("..INSERT..");
	System.out.println("Enter user ID");
	user.setId(sc.nextInt());
	sc.nextLine();
	System.out.println("Enter name");
	user.setName(sc.nextLine());
	System.out.println("Enter username");
	user.setUsername(sc.nextLine());
	System.out.println("Enter password");
	user.setPassword(sc.nextLine());
	System.out.println("Enter email");
	user.setEmail(sc.nextLine());
	System.out.println("Enter phone");
	user.setPhone(sc.nextLine());
	System.out.println("Enter address");
	user.setAddress(sc.nextLine());
	
	System.out.println(userImpl.insert_user(user));
	
	//update
	System.out.println("..UPDATE..");
	System.out.println("Enter name");
	user.setName(sc.nextLine());
	System.out.println("Enter username");
	user.setUsername(sc.nextLine());
	System.out.println("Enter password");
	user.setPassword(sc.nextLine());
	System.out.println("Enter email");
	user.setEmail(sc.nextLine());
	System.out.println("Enter phone");
	user.setPhone(sc.nextLine());
	System.out.println("Enter address");
	user.setAddress(sc.nextLine());
	System.out.println("Enter user ID");
	user.setId(sc.nextInt());
	
	System.out.println(userImpl.update_user(user));
	
	//delete
	System.out.println("..DELETE..");
	System.out.println("Enter user ID");
	int id=sc.nextInt();
	user.setId(id);
	
	System.out.println(userImpl.delete_user(id));
	

}}
