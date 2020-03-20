import java.util.Scanner;
public class Assignment9{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num1,num2;		
		System.out.println("Enter the 2 numbers");
		num1=in.nextInt();
		num2=in.nextInt();
		try{
			System.out.println("The quotient of "+num1+"/"+2+" = "+num1/num2);
		}
		catch(ArithmeticException e){
			System.out.println("DivideByZeroException caught");
		}
		finally{
			System.out.println("Inside finally block");
		}
	}
}