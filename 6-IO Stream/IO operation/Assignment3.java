import java.util.*;
import java.io.*;
public class Assignment3{
	public static void main(String[] args) throws IOException{
		Map<String,Integer> map = new HashMap<String,Integer>();
		FileReader inp_file =null;
		try{
		inp_file = new FileReader("inputfile.txt");
		int c=0;
		String word="";
		do{
			
			
			
			try{
			if (((char)c>='a' && (char)c<='z')||((char)c>='A' && (char)c<='Z')){	
				word=word+(char)c;
			}
			else{
				
				
				System.out.println(word);
				map.put(word,map.get(word)+1);
				word="";
			}
				}
			catch(NullPointerException e){
				
				map.put(word,1);
				System.out.println(word);
				
				word="";
			}
			
			
		}while((c=inp_file.read())!=-1);
		try{
			map.put(word,map.get(word)+1);
		}
		catch(NullPointerException e){
			map.put(word,1);
		}
		
		map.remove("");
		for (Map.Entry m : map.entrySet()){
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		}
		finally{
			if (inp_file !=null){
				inp_file.close();
			}
			
		}
	}
}