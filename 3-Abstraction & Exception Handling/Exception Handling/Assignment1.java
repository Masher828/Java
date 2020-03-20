import java.util.Scanner;
public class Assignment1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int inp;
		System.out.print("Enter an integer:");
		try{
			inp=in.nextInt();
			System.out.println("The square value is "+inp*inp);
			System.out.println("The work has been done successfully");
		}
		catch (Exception e){
			System.out.println("Entered input is not a valid format for an integer ");
		}
	}
}