import java.util.*;
public class Assignment3{
	public static void printAll(ArrayList list){
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			Object ele = itr.next();
			System.out.println(ele);
		}
	}
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Manish");
		list.add("String");
		printAll(list);
		
	}
}