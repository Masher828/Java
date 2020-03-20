import java.util.*;
public class Assignment4{
	public static void main(String[] args){
		HashMap<String,Long> ContactList = new HashMap<String,Long>();
		Scanner in = new Scanner(System.in);
		ContactList.put("Manish",8285015395l);
		ContactList.put("Bhawna",9810245608l);
		ContactList.put("Rajesh",9971821552l);
		int top=0;
		System.out.println("Enter the name you want to search for ");
		String name="";
		name = in.nextLine();
		try{	
			long numb = ContactList.get(name); 
			System.out.println("Name you entered exist in the record " );
		}
		catch(Exception e){
			System.out.println("Name you entered does not exist in the record ");
		}
		System.out.println("Enter the number you want to search for ");
		long num = in.nextLong();
		for (String nam : ContactList.keySet()){
			 if (ContactList.get(nam)==num){
				System.out.println("Entered number exist in the record");
				top=-1;
			}
		}
		if (top==0){
			System.out.println("Entered number does not exist in the record ");
		}
			System.out.println("Name \t\t Phone number ");
		for (Map.Entry m : ContactList.entrySet()){
			System.out.println(m.getKey()+"\t\t"+m.getValue());
		}
	}
}