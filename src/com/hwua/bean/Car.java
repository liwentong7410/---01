package com.hwua.bean;

public class Car {

	private int id;
	private String carName;
	private String carColor;
	private String carPrice;
	private String carDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(String carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarDate() {
		return carDate;
	}
	public void setCarDate(String carDate) {
		this.carDate = carDate;
	}
	public Car() {
		super();
	}
	public Car(int id, String carName, String carColor, String carPrice, String carDate) {
		super();
		this.id = id;
		this.carName = carName;
		this.carColor = carColor;
		this.carPrice = carPrice;
		this.carDate = carDate;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", carName=" + carName + ", carColor=" + carColor + ", carPrice=" + carPrice
				+ ", carDate=" + carDate + "]";
	}
	
	
	
}
