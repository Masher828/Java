abstract class Instrument{

	public abstract void play();
}


class Piano extends Instrument{

	public void play(){

		System.out.println("Piano is playing   tan tan tan ");
	}
}

class Flute extends Instrument{
	
	public void play(){

		System.out.println("Flute is playing   toot toot toot toot");
	}
}

class Guitar extends Instrument{
	
	public void play(){
		
		System.out.println("Guitar is plating   tin tin tin  ");
	}
}

public class Assignment3{
	static void check(Instrument instance, int index){
		if (instance instanceof Piano){

			System.out.println("\ninstrument["+index+"] is an instance of Piano");
			instance.play();
		}
		else if (instance instanceof Flute){
			System.out.println("\ninstrument["+index+"] is an instance of Flute");
			instance.play();
		}
		else{
			System.out.println("\ninstrument["+index+"] is an instance of Guitar");
			instance.play();
		}
	}
		
	public static void main(String[] args ){
		
		Instrument instrument[] = new Instrument[10];
		instrument[0]=new Piano();
		instrument[1]=new Flute();
		instrument[2]=new Guitar();
		check(instrument[0],0);
		check(instrument[1],1);
		check(instrument[2],2);
	}
	
		
}
		