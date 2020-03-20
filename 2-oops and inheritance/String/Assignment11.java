import java.util.Scanner;
public class Assignment11{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		int index=str.indexOf(',');
		String sub_str,out="";
		sub_str=str.substring(index+1,str.length());
		int i=0;
		str=str.substring(0,str.length()-sub_str.length());
		while(str.indexOf(sub_str,i)>0){
			i=str.indexOf(sub_str,i);
			out=out+str.charAt(i-1)+str.charAt(i+sub_str.length());
			i++;
		}
		
		System.out.println(out);
	}
}