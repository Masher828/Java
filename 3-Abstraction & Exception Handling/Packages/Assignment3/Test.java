import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
public class Test{
	public static void main(String[] args){
		Hero hero = new Hero(150,"Splender","bkjg34fsdJNX8","Manish Sharma");
		Honda honda = new Honda(200,"Civic","bsaf23GJ67KJ","Masher");
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
	}
}
		 