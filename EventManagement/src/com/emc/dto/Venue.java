package com.emc.dto;

public class Venue extends EMBase
{
	private String Desc;
	private String Streetaddress;
	private String country;
	private String city;
	private String State;
	private int pincode;
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public String getStreetaddress() {
		return Streetaddress;
	}
	public void setStreetaddress(String streetaddress) {
		Streetaddress = streetaddress;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
