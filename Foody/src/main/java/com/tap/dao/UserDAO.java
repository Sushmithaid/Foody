package com.tap.dao;

import java.util.List;

import com.tap.model.User;

public interface UserDAO 
{
	List getAllUserDetails();
	
	User getSpecificDetails(int id);
	
	boolean insert_user(User user);
    
	boolean update_user(User user);
	
	boolean delete_user(int id);

}
