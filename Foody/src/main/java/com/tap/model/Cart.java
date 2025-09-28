package com.tap.model;

public class Cart 
{
    private int cart_id;
    private int id;
    private int rest_id;
    private int menu_id;
    private String item_name;
    private int item_price;
    private String item_image;
    private int quantity;

    public Cart() 
    {
		
	}

	public Cart(int cart_id, int id, int rest_id, int menu_id, String item_name, int item_price, String item_image,
			int quantity) 
	{
		super();
		this.cart_id = cart_id;
		this.id = id;
		this.rest_id = rest_id;
		this.menu_id = menu_id;
		this.item_name = item_name;
		this.item_price = item_price;
		this.item_image = item_image;
		this.quantity = quantity;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRest_id() {
		return rest_id;
	}

	public void setRest_id(int rest_id) {
		this.rest_id = rest_id;
	}

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getItem_price() {
		return item_price;
	}

	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}

	public String getItem_image() {
		return item_image;
	}

	public void setItem_image(String item_image) {
		this.item_image = item_image;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() 
	{
		return cart_id+" "+id+" "+rest_id+" "+menu_id+" "+item_name+" "+item_price+" "+item_image+" "+quantity;
	}
    
}

