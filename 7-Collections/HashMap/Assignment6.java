import java.util.*;
class Country{
	Hashtable<String, String> M1 = new Hashtable<String, String>();
	public Hashtable<String, String> saveCountry(String country, String capital){
		M1.put(country,capital);
		return M1;
	}
	public String getCapital(String country){
		return M1.get(country);
	}
	public String getCountry(String capital){
		for (String country : M1.keySet()){
			if (M1.get(country).equals(capital)){
				return country;
			}
		}
		return "Capital Does not exist in record";
	}
	public Hashtable<String, String> reverseHashtable(Hashtable<String, String> M1){
		Hashtable<String, String> M2 = new Hashtable<String, String>();
		for(String country : M1.keySet()){
			M2.put(M1.get(country),country);
		}
		return M2;
	}
	public ArrayList<String> tableToArray(Hashtable<String,String> map){
		ArrayList<String> arr = new ArrayList<String>();
		for (String country : map.keySet()){
			arr.add(country);
		}		
		return arr;
	}
}

public class Assignment6{
	public static void main(String[] args){
		Hashtable<String,String> M1;
		ArrayList<String> arr;
		Hashtable<String,String> M2;
		Country country = new Country();
		M1=country.saveCountry("India","New Delhi");
		M1=country.saveCountry("Japan","Tokyo");
		M1=country.saveCountry("Maharashtra","Mumbai");
		System.out.println("Capital of the India is : "+country.getCapital("India"));
		System.out.println("Country of New Delhi is : :"+country.getCountry("New Delhi"));
		System.out.println("Contents of Hash table (M1) : "+M1);
		M2=country.reverseHashtable(M1);
		System.out.println("Contents of Hash table (M2) : "+M2);
		System.out.println("Countries stored in ArrayList : "+country.tableToArray(M1));
	}
}
		
	
		