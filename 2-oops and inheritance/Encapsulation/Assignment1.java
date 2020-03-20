class Author{
	public String name, email;
	char gender;
	Author(){
	}
	Author(String name, String email, char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
		
	public String getAName(){
		return name;
	}
	
	String getEmail(){
		return email;
	}

	char getGender(){
		return gender;
	}
	
}



class Book{
	String name;
	double price;
	int InStock;
	
	Author auth;
	Book(String args[], Author auth){
		this.auth=auth;
		name=args[0];
		price = Double.parseDouble(args[4]);
		InStock = Integer.parseInt(args[5]);
	}
	
	void setName(String name){
		this.name=name;
	}
	
	void setPrice(Double price){
		this.price=price;
	}

	void setInStock(int InStock){
		this.InStock=InStock;
	}

	String getName(String name){
		return name;
	}
	
	Double getPrice(Double price){
		return price;
	}

	int getInStock(int InStock){
		return InStock;
	}
	
	void showDetails(){
		System.out.println("Book name : "+ name);
		String auth0=auth.getAName();
		System.out.println("Author Name : "+auth.getAName());
		System.out.println("Author E-Mail : "+ auth.getEmail());
		System.out.println("Author Gender : "+ auth.getGender());
		System.out.println("Price : "+ price);
		System.out.println("Stock : "+ InStock);
	}

}

class Assignment1{
	public static void main(String args[]){
		if (args.length<6){
			System.out.println("Enter details in following order \n Book name, author name, author email, author gender, book price, book stock");
		}
		else{
			
			Author obj1 = new Author(args[1],args[2],args[3].charAt(0));
			Book obj = new Book(args,obj1);
			obj.showDetails();
			
			

			
		}
	}
}			