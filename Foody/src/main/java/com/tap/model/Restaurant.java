package com.tap.model;

public class Restaurant 
{
	private int rest_id;
	private String name;
	private String address;
	private String phone;
	private String rating;
	private String cusineType;
	private String isActive;
	private String eta;
	private int id;
	private String ImagePath;
	
	public Restaurant()
	{
		
	}

	public Restaurant(int rest_id, String name, String address, String phone, String rating, String cusineType,
			String isActive, String eta, int id, String ImagePath) {
		super();
		this.rest_id = rest_id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.rating = rating;
		this.cusineType = cusineType;
		this.isActive = isActive;
		this.eta = eta;
		this.id = id;
		this.ImagePath = ImagePath;
	}

	public int getRest_id() {
		return rest_id;
	}

	public void setRest_id(int rest_id) {
		this.rest_id = rest_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getCusineType() {
		return cusineType;
	}

	public void setCusineType(String cusineType) {
		this.cusineType = cusineType;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImagePath() {
		return ImagePath;
	}

	public void setImagePath(String ImagePath) {
		this.ImagePath = ImagePath;
	}
	
	@Override
	public String toString() 
	{
		return rest_id+" "+name+" "+address+" "+phone+" "+rating+" "+cusineType+" "+isActive+" "+eta+" "+id+" "+ImagePath;
	}
	
	

}
