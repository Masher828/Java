import java.util.Scanner;
public class Assignment9{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String inp=in.nextLine();
		int index=inp.indexOf(',');
		int i=0,j=index+1;
		while((i!=index)&&(j!=inp.length())){
			System.out.print(inp.charAt(i));
			System.out.print(inp.charAt(j));
			i++;
			j++;
		}
		while(i!=index){
			System.out.print(inp.charAt(i));
			i++;
		}
		while(j!=inp.length()){
			System.out.print(inp.charAt(j));
			j++;
		}
	}
}