import java.util.*;
public class Assignment1{
	HashSet<String> H1= new HashSet<String>();
	void saveCountryNames(String CountryName){
		H1.add(CountryName);
	}	
	String getCountry(String CountryName){
		for (String country : H1){
			if (country.equals(CountryName)){
				return country;
			}
		}
		return null;
	}
	
	public static void main(String[] args){
		Assignment1 obj = new Assignment1();
		obj.saveCountryNames("India");
		obj.saveCountryNames("United States");
		obj.saveCountryNames("Australia");
		obj.saveCountryNames("Pakistan");
		obj.saveCountryNames("Afghanistan");
		System.out.println(obj.getCountry("India"));
		System.out.println(obj.getCountry("China"));
	}
}