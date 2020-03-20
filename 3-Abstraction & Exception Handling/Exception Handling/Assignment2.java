import java.util.Scanner;

public class Assignment2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int sizeOfArray=in.nextInt();
		int[] arr = new int[sizeOfArray];
		int temp;
		System.out.println("Enter the elements in the array");
		for (int i=0;i<sizeOfArray;i++){
			temp=in.nextInt();
			arr[i]=temp;
		}
		System.out.println("Enter the index of the array element you want to access");
		int index=in.nextInt();
		try{
			System.out.println("The array element at index "+index+" = "+arr[index]);
			System.out.println("The array element successfully accessed");
		}
		catch (ArrayIndexOutOfBoundsException e){
			//System.out.println(e);
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
	}
}