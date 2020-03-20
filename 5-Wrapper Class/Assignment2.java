public class Assignment2{
	public static void main(String[] args){
		int i=Integer.parseInt(args[0]);		
		System.out.println("Given Number :"+i);
		String out=Integer.toBinaryString(i);
		System.out.println("Binary equivalent :"+out);
		out=Integer.toOctalString(i);
		System.out.println("Octal equivalent :"+out);
		out=Integer.toHexString(i);
		System.out.println("Hexadecimal equivalent :"+out);
	}
}