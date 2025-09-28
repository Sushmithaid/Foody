package com.tap.dao;

import java.util.List;

import com.tap.model.Restaurant;

public interface RestaurantDAO 
{
	List getAllRestaurentDetails();
	
	Restaurant getSpecificDetails(int rest_id);
	
	boolean insert_Restaurent(Restaurant rest);
	
	boolean update_Restaurant(Restaurant rest);
	
	boolean delet_Restaurent(int res_id);

}
