class InvalidCountryException extends Exception {
	InvalidCountryException(String s){
		super(s);
	}
}

public class UserRegistration{
	static void registerUser(String username, String userCountry) throws InvalidCountryException{
		if (userCountry.equalsIgnoreCase("india")!=true){
			System.out.println(username);
			throw new InvalidCountryException("User Outside India  cannot be registered");
		}
		else{
			System.out.println("User registration done successfully");
		}
	}
	public static void main(String[] args){
		String username="",userCountry="";
			int index=args[0].indexOf(',');
			username=args[0].substring(0,index);
			userCountry=args[0].substring(index+1,args[0].length());
		
	
		try{
			registerUser(username,userCountry);
		}
		catch(InvalidCountryException e){
			System.out.println(e);
		}
			
	}
}