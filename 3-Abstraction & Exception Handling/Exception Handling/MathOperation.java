
public class MathOperation{
	public static void main(String[] args){	
		int[] arr = new int[5];
		try{
		for (int i=0;i<5;i++){
			arr[i]=Integer.parseInt(args[i]);
		
		}
		double sum=0;
		double avg;
		for(int i=0 ;i<5;i++){
			sum=sum+arr[i];
		}
		avg=sum/5;
		System.out.println("The sum of elements is "+sum);
		System.out.println("The average of elements is "+avg);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
			
	}
}