import java.util.Scanner;
public class Assignment4{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String inp = in.nextLine();
		if (inp.length()%2 == 0){
			System.out.println(inp.substring(0,inp.length()/2));
		}
		else{
			System.out.println("null");
		}
	}
}
			