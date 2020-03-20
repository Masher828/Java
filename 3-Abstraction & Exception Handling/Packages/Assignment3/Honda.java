package com.automobile.twowheeler;
import com.automobile.Vehicle;

public class Honda extends Vehicle{
	int speed;
	String ModelName, RegistrationNumber,OwnerName;
	public Honda(int speed, String ModelName, String RegistrationNumber, String OwnerName){
		
		this.speed =speed;		
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
	public void cdplayer(){
		System.out.println("provides facility to control the cd player device which is available in the car.");
	}
}
