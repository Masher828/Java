package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test{
	public static void main(String[] args){
	Veena ven = new Veena();
	Saxophone sax = new Saxophone();
	Playable Sax = new Saxophone();
	Playable Ven;
	Ven = new Veena();
	System.out.println("instance of Veena using reference of Veena : ");
	ven.play();
	System.out.println("\ninstance of Saxophone using reference of Saxophone : ");
	sax.play();
	System.out.println("\ninstance of Veena using reference of Playable : ");
	Ven.play();
	System.out.println("\ninstance of Saxophone using reference of Playable : ");
	Sax.play();
	}
}

	