import java.util.*;
public class Assignment3{
	public static void main(String[] args){
		TreeSet<String> tree = new TreeSet<String>();
		Scanner in = new Scanner(System.in);
		tree.add("A");
		tree.add("C");
		tree.add("B");
		tree.add("X");
		tree.add("Y");
		tree.add("Z");
		tree.add("D");
		NavigableSet tr = tree.descendingSet();
		Iterator itr = tr.iterator();
		System.out.println("Reverse the elements of Set : ");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		itr = tree.iterator();
		System.out.println("Elements of treeset using iterator :");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("Enter the string to be searched for ");
		String str = in.nextLine();
		itr = tree.iterator();
		int found=0;		
		
		while(itr.hasNext()){
			String Str=(String)itr.next();
			if (Str.equals(str)){			
				found=1;
				System.out.println("Found");
			}
		}
		if (found==0){
			System.out.println("Not Found");
		}
			
	}
}
