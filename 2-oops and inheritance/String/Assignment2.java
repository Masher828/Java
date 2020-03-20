import java.util.*;
public class Assignment2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String inp = s.nextLine();
		int index= inp.indexOf(',');
		inp=inp.toLowerCase();
		String inpu="";
		if (inp.charAt(index-1)==inp.charAt(index+1)){
			inpu=inp.substring(0,index)+inp.substring(index+2,inp.length()-1);
			//inp.remove(inp.charAt(index),'');
		}
		else{
			inpu=inp.substring(0,index)+" "+inp.substring(index+1,inp.length());
		}
		System.out.println(inpu);
	}
}
		