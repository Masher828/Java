import java.util.*;
import java.io.*;
public class Assignment2{
	public static void main(String[] args) throws IOException{
		Scanner inp = new Scanner(System.in);
		FileReader in=null;
		FileWriter out=null;	
		try{
			String inp_file="";
			
			
			System.out.println("Enter the input file name : ");
			inp_file=inp.nextLine();
			in= new FileReader(inp_file);
			System.out.println("Enter the output file name : ");	
			String out_file = inp.nextLine();
			out=new FileWriter(out_file);
			int c=0;
			
			while((c=in.read())!=-1){
				out.write((char)c);
			}
			System.out.println("File is copied.");
		}
		finally{	
			if (in!=null){
				inp.close();
			}
			if (out!=null){
				out.close();
			}
		}
	}
}
			