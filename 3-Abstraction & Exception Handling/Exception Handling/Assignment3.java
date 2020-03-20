import java.util.Scanner;
import java.util.InputMismatchException;
public class Assignment3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		

			int sizeOfArray ;
			sizeOfArray=in.nextInt();
			int[] arr= new int[sizeOfArray];
			int temp;
			System.out.println("Enter the elements in the array");
		try{
			for (int i=0;i<sizeOfArray;i++){
				temp=in.nextInt();
				arr[i]=temp;
			}
			System.out.println("Enter the index of the array element you want to access");
			int index = in.nextInt();
			System.out.println("The array element at index "+index+" = "+arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException e){
			System.out.println("java.util.NumberFormatException");
		}
		catch(InputMismatchException e){
			System.out.println("java.util.InputMismatchException");
		}
	}
}
		