import java.util.*;
public class Assignment2{
	HashMap<String,String> map = new HashMap<String,String>();
	public String checkValue(String Value){
		for(String key : map.keySet()){
			if (map.get(key).equals(Value)){
				return "Entered Value exists in the record";
			}
		}
		return "Entered Value does not exist in the record";
	}
	public String checkKey(String Key){
		try{
			String value= map.get(Key);
			return ("Entered Key exist in the record with value as :" + value);
		}
		catch (Exception e){
			return("Entered Key does not exist in the record");
		}
	}
	public void display(){
		System.out.println("Key\t\t\t\t Value");
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry m= (Map.Entry)itr.next();
			System.out.println(m.getKey()+"\t\t\t\t"+m.getValue());
		}
	}
	public static void main(String[] args){
		Assignment2 obj = new Assignment2();
		obj.map.put("Manish","Sharma");	
		obj.map.put("Masher","Sharmaa");
		obj.map.put("Meenakshi","Dogra");
		obj.map.put("Nikhil","Singh");
		obj.map.put("Mohit","Garg");
		System.out.println(obj.checkValue("Sharma"));
		System.out.println(obj.checkKey("Mohit"));
		obj.display();
	}
}