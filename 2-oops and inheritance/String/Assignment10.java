import java.util.Scanner;
public class Assignment10{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		
		String out="";
		int index=str.indexOf(',');
		int num=str.charAt(index+1);
		
		System.out.println(num);
		//int num=Integer.parseInt(str(str.indexOf(',')+1));
		for (int i=48;i<num;i++){
			out=out+str.substring(str.length()-5,str.length()-2);
		}
		System.out.println(out);
	}
}