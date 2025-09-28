package com.tap.dao;

import java.util.List;

import com.tap.model.Cart;

public interface CartDAO 
{
		void addToCart(Cart cart);
		
	    List<Cart> getCartItems(int id);
	    
	    void updateQuantity(int cart_id, int quantity);
	    
	    void removeItem(int cart_id);
	    
	    void clearCart(int id);

}
