abstract class Compartment{
	public abstract String notice();
		
}

class FirstClass extends Compartment{
	public String notice(){
		return "AC of coach number AC-4 is not working";
	}
}
	
class Ladies extends Compartment{
	public String notice(){
		return "Please do not litter";
	}
}

class Luggage extends Compartment{
	public String notice(){
		return "Please attach some kind of marking/souvenir";
	}
}

public class TestCompartment{
	public static void main(String[] args){
		Compartment compartment[] = new Compartment[10];
		compartment[1]=new Luggage();
		compartment[2]=new Ladies();
		compartment[3]=new FirstClass();
		System.out.println("Notice of Luggage Class : "+compartment[1].notice());
		System.out.println("Notice of Ladies Class : " +compartment[2].notice());
		System.out.println("Notice of FirstClass Class : "+compartment[3].notice());
	}
}