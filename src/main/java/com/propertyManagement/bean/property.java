package com.propertyManagement.bean;

public class property {
	
	protected int id;
	protected String category;
	protected String type;
	
	protected String province;
	protected String address;
	protected String noofBedrooms;
	
	protected String noofBathrooms;
	protected String floorArea;
	protected String sizeofLand;
	
	protected String price;
	protected String features;
	protected String details;
	
	protected String name;
	protected String email;
	protected String contactNo;
	
	public property() {
	}
	 public property(String category, String type, String province, String address, String noofBedrooms, String noofBathrooms, String floorArea, String sizeofLand, String price, String features, String details, String name, String email, String contactNo) {
	        super();
	        this.category = category;
	        this.type = type;
	        this.province = province;
	        this.address = address;
	        
	        this.noofBedrooms = noofBedrooms;
	        this.noofBathrooms = noofBathrooms;
	        this.floorArea = floorArea;
	        this.sizeofLand = sizeofLand;
	        
	        this.price = price;
	        this.features = features;
	        this.details = details;
	        this.name = name;
	        
	        this.email = email;
	        this.contactNo = contactNo;
	    }
	 
	 public property(int id, String category, String type, String province, String address, String noofBedrooms, String noofBathrooms, String floorArea, String sizeofLand, String price, String features, String details,String name,String email,String contactNo) {
	        super();
	        this.id = id;
	        this.category = category;
	        this.type = type;
	        this.province = province;
	        this.address = address;
	        this.noofBedrooms = noofBedrooms;
	        this.noofBathrooms = noofBathrooms;
	        this.floorArea = floorArea;
	        this.sizeofLand = sizeofLand;
	        this.price = price;
	        this.features = features;
	        this.details = details;
	        this.name = name;
	        this.email = email;
	        this.contactNo = contactNo;
	    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNoofBedrooms() {
		return noofBedrooms;
	}
	public void setNoofBedrooms(String noofBedrooms) {
		this.noofBedrooms = noofBedrooms;
	}
	public String getNoofBathrooms() {
		return noofBathrooms;
	}
	public void setNoofBathrooms(String noofBathrooms) {
		this.noofBathrooms = noofBathrooms;
	}
	public String getFloorArea() {
		return floorArea;
	}
	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}
	public String getSizeofLand() {
		return sizeofLand;
	}
	public void setSizeofLand(String sizeofLand) {
		this.sizeofLand = sizeofLand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	

}
