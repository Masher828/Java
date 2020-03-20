import java.util.*;
public class Assignment2{
	public static void main(String[] args){
		HashSet<String> hs = new HashSet<String>();
		hs.add("Manish");
		hs.add("Masher");
		hs.add("Rajesh");
		hs.add("Ramesh");
		hs.add("Suresh");
		Iterator itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}