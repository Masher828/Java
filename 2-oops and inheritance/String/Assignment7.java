import java.util.Scanner;
public class Assignment7{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String inp=in.nextLine();	
		if (inp.charAt(0)=='x' && inp.charAt(inp.length()-1)=='x'){
			inp=inp.substring(1,inp.length()-1);
		}
		System.out.println(inp);
	}
}