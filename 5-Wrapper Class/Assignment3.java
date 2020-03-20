import java.util.Scanner;
public class Assignment3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		String binary = Integer.toBinaryString(num);
		num=Integer.parseInt(binary);
		binary = String.format("%08d",num);
		System.out.println(binary);
	}
}