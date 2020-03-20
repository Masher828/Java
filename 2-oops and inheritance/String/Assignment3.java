import java.util.Scanner;
public class Assignment3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String inp=in.nextLine();
		String out="";
		for(int i=0;i<inp.length();i++){
			out=out+inp.substring(0,2);
		}
		System.out.println(out);
	}
}