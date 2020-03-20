import java.util.Scanner;
public class Assignment8{
	public static void main(String[] args){	
		Scanner in = new Scanner(System.in);
		String inp= in.nextLine();
		int index=inp.indexOf('*');	
		String out;
		if (index==0){
			out=inp.substring(2,inp.length());
		}
		else if (index==inp.length()-1){
			out=inp.substring(0,inp.length()-2);
		}
		else{
			out=inp.substring(0,index-1)+inp.substring(index+2,inp.length());
		}
		System.out.println(out);
	}
}