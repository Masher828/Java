import java.util.Scanner;
public class Assignment5{
	static void Division(int num1, int num2){
					
			System.out.println(num1/num2);
			
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num1,num2;
		num1 = in.nextInt();
		num2 = in.nextInt();
		Assignment5 assi = new Assignment5(); 
		try{
			assi.Division(num1,num2);
		}
		catch(ArithmeticException e){
			System.out.println("num 2 cannot be zero");
		}
		
	}
}
		