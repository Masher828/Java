package com.automobile.FourWheeler;
import com.automobile.Vehicle;
public class Logan extends Vehicle{
	int speed;
	String ModelName;
	String RegistrationNumber;
	String OwnerName;
	public Logan(int speed, String ModelName, String RegistrationNumber, String OwnerName){
		this.speed = speed;
		this.ModelName=ModelName;
		this.RegistrationNumber=RegistrationNumber;
		this.OwnerName=OwnerName;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	public String getModelName(){
		return this.ModelName;
	}
	public String getRegistrationNumber(){
		return this.RegistrationNumber;
	}
	public String getOwnerName(){
		return this.OwnerName;
	}
	public void gps(){
		System.out.println("provides facility to control the gps device ");
	}
}
		