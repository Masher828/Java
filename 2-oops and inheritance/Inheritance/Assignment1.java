class Animal{
	public void eat(){
		System.out.println("Inside eat method of Animal");
	}
	public void sleep(){
		System.out.println("Inside sleep method of Animal");
	}
}

class Bird extends Animal{
	public void eat(){
		System.out.println("Inside eat method of Bird");
	}
	public void sleep(){
		System.out.println("Inside sleep method of Bird");
	}
	public void fly(){
		System.out.println("Inside fly method of Bird");
	}
}

class Assignment1{
	public static void main(String[] args){
		Animal animal = new Animal();
		Bird bird = new Bird();
		animal.eat();
		animal.sleep();
		bird.eat();
		bird.sleep();
		bird.fly();
	}
}

		