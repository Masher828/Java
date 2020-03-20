import java.util.*;
public class Assignment1{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("January");
		list.add("February");
		list.add("March");
		list.add("April");
		list.add("May");
		list.add("June");
		list.add("July");
		list.add("August");
		list.add("September");
		list.add("October");
		list.add("November");
		list.add("December");
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			Object ele = itr.next();
			System.out.println(ele + "  ");
		}
		
		
		
	}
}