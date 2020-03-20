import java.util.*;
public class Assignment3{
	Hashtable<String,String> India = new Hashtable<String,String>();
	public static void main(String[] args){
		Assignment3 obj = new Assignment3();
		obj.India.put("Maharashtra","Mumbai");
		obj.India.put("Goa","Panjim");
		obj.India.put("Assam","Dispur");
		obj.India.put("Bihar","Patna");		
		System.out.println("States\t\tCapitals");	
		for (Map.Entry m : obj.India.entrySet()){
			System.out.println(m.getKey()+"\t\t"+m.getValue());
		}
	}
}
				