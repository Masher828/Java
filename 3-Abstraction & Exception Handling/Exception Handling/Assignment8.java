class AgeLimitException extends Exception{
	AgeLimitException(String s){
		super(s);
	}
}

public class Assignment8{
	static public void validate(int age) throws AgeLimitException{
		
		if ((age>=18 && age<=60 )== false){
			
			throw new AgeLimitException("Age is not within Limits\n Exiting...");
		}
		else{
			System.out.println("Age is within Limits");
		}
	}
	public static void main(String[] args){
		String name;
		int age,index;
		index=args[0].indexOf(',');
		name=args[0].substring(0,index);
		age=Integer.parseInt(args[0].substring(index+1,args[0].length()));
		try{
			validate(age);
		}
		catch(AgeLimitException e){
			System.out.println(e);
		}
	}
}