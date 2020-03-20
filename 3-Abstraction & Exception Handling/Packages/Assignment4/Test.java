import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
import com.automobile.FourWheeler.Logan;
import com.automobile.FourWheeler.Ford;
public class Test{
	public static void main(String[] args){
		Hero hero = new Hero(150,"Splender","bkjg34fsdJNX8","Manish Sharma");
		Honda honda = new Honda(200,"Civic","bsaf23GJ67KJ","Masher");
		Logan logan = new Logan(250,"Lancer","vafsh8752HJ","Rahul Sharma");
		Ford ford = new Ford(300,"Ecosport","oihjwe56DFS","Sunny");
		System.out.println("Hero Details ");
		System.out.println("Speed : "+hero.getSpeed()+"\nModel Name : "+hero.getModelName()+"\nRegistration N0 : "+ 
		hero.getRegistrationNumber()+"\nOwner Name : "+hero.getOwnerName());
		System.out.print("Services : ");
		hero.radio();
		System.out.println("Honda Details");
		System.out.println("Speed : "+honda.getSpeed()+"\nModel Name : "+honda.getModelName()+"\nRegistration N0 : "+ 
		honda.getRegistrationNumber()+"\nOwner Name : "+honda.getOwnerName());
		System.out.print("Services : ");
		honda.cdplayer();
		System.out.println("Logan Details");
		System.out.println("Speed : "+logan.getSpeed()+"\nModel Name : "+logan.getModelName()+"\nRegistration N0 : "+ 
		logan.getRegistrationNumber()+"\nOwner Name : "+logan.getOwnerName());
		System.out.print("Services : ");
		logan.gps();
		System.out.println("Ford Details");
		System.out.println("Speed : "+ford.getSpeed()+"\nModel Name : "+ford.getModelName()+"\nRegistration N0 : "+ 
		ford.getRegistrationNumber()+"\nOwner Name : "+ford.getOwnerName());
		System.out.print("Services : ");
		ford.tempControl();
	}
}
		 