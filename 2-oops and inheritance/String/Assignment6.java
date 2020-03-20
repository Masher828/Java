import java.util.Scanner;
public class Assignment6{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String string1,string2,out;
		string1=in.nextLine();
		string2=in.nextLine();
		if (string1.length()<string2.length()){
			out=string1+string2+string1;
		}
		else{
			out=string2+string1+string2;
		}
		System.out.println(out);
	}
}