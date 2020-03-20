import java.util.*;
public class Assignment5{
	public static void main(String[] args){
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("January");
		ll.add("February");
		ll.add("March");
		ll.add("April");
		ll.add("May");
		ll.add("June");
		ll.add("July");
		ll.add("August");
		ll.add("September");
		ll.add("October");
		ll.add("November");
		ll.add("December");
		for(Object ele : ll){
			System.out.println(ele);
		}
	}
}