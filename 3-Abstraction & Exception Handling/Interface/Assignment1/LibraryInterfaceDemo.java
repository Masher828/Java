

interface LibraryUser{
	abstract void registerAccount( int age, String bookType);	
	abstract void requestBook();
}
class KidUsers implements LibraryUser{
	int age;
	String bookType;
	public void registerAccount(int age, String bookType){		
		if (age<12){
			this.age=age;
			this.bookType=bookType;
			System.out.println("You have successfully registered under a Kids Account");
			
		}
		else{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
			
		}
	}
	public void requestBook(){
		if (this.bookType.equalsIgnoreCase("kids")){
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else{
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
	
}
		
class AdultUser implements LibraryUser{
	int age;
	String bookType;
	public void registerAccount(int age, String bookType){		
		if (age>12){
			this.age=age;
			this.bookType=bookType;
			System.out.println("You have successfully registered under an Adult Account");
		}
		else{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
			
		}
	}
	public void requestBook(){
		if (this.bookType.equalsIgnoreCase("Fiction")){
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
	
}


class LibraryInterfaceDemo{
	public static void main(String[] args){	
		KidUsers kid = new KidUsers();
		AdultUser adult = new AdultUser();
		kid.registerAccount(11,"kids");
		kid.requestBook();
		adult.registerAccount(11,"kids");
		
		
	}
}
		
		
	