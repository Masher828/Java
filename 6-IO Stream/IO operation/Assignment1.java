import java.io.*;
import java.util.Scanner;
public class Assignment1{
	public static void main(String[] args) throws  FileNotFoundException, IOException{
		Scanner in = new Scanner(System.in);
		FileReader cin = null;
		try{
		System.out.println("Enter the file name : ");
		String file=in.nextLine();
		cin = new FileReader(file);
		System.out.println("Enter the character to be counted : ");
		char X = in.next().charAt(0);
		int c=0,count=0;
		while((c= cin.read())!=-1){
			if ((char)c==X){
				count+=1;
			}
		}
		System.out.println("File '"+file+"' has "+count+" instances of letter "+X);
		}
		finally{
			if (in != null) {
            in.close();
         }}
	}
}