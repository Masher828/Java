class Fruit{
	String Name;
	String Taste;
	double size;
	void eat(){
		System.out.println("Name : "+Name+"\nTaste : "+Taste);
	}
}
class Apple extends Fruit{
	void eat(){
		System.out.println("Name : "+ Name + "\nTaste : "+Taste);
	}
	void setName(String name){
		Name=name;
	}
	void setTaste(String taste){
		Taste=taste;
	}
}

class Orange extends Fruit{
	void eat(){
		System.out.println("Name : "+ Name + "\nTaste : "+Taste);
	}
	void setName(String name){
		Name=name;
	}
	void setTaste(String taste){
		Taste=taste;
	}
}

public class Assignment1{
	public static void main(String[] args){
		Apple apple = new Apple();
		Orange orange = new Orange();
		apple.setName("Apple");
		apple.setTaste("Sweet Juicy");
		orange.setName("Orange");
		orange.setTaste("Sweet Pulpy");
		apple.eat();
		orange.eat();
	}
}
	
