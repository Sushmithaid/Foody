package com.tap.model;

public class Menu 
{
	private int menu_id;
	private int rest_id;
	private String itemName;
	private String price;
	private String rating;
	private String imagePath;
	
	public Menu()
	{
		
	}

	public Menu(int menu_id, int rest_id, String itemName, String price, String rating,
			 String imagePath) {
		super();
		this.menu_id = menu_id;
		this.rest_id = rest_id;
		this.itemName = itemName;
		this.price = price;
		this.rating = rating;
		this.imagePath = imagePath;
	}

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	public int getRest_id() {
		return rest_id;
	}

	public void setRest_id(int rest_id) {
		this.rest_id = rest_id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	@Override
	public String toString() 
	{
		return menu_id+" "+rest_id+" "+itemName+" "+price+" "+rating+" "+imagePath;
	}

}
