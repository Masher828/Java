import java.util.Scanner;
public class Assignment5{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String inp = in.nextLine();
		System.out.println(inp.substring(1,inp.length()-1));
	}
}