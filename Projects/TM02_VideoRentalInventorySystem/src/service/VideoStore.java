package service;

public class VideoStore{
	Video[] store = new Video[10];
	
	
	static int i=0;
	public void addVideo(String name) {
		store[i]= new Video(name);
		store[i].checkout=false;
		store[i].rating=0;
		i++;
		System.out.println("Video \""+name+"\" added successfully.");
	}
	public void doCheckout(String name) {
		for(int j=0;j<i;j++) {
			if (store[j].getName().equals(name)) {
				store[j].doCheckout();
				System.out.println("Video \""+name+"\" checked out successfully.");
			}
		}
	}
	public void doReturn(String name) {
		for (int j=0;j<i;j++) {
			if(store[j].getName().equals(name)) {
				store[j].doReturn();
				System.out.println("Video \""+name+"\" returned successfully.");
			}
		}
	}
	
	public void recieveRating(String name, int rating) {
		for (int j =0;j<i;j++) {
			if (store[j].getName().equals(name)) {
				store[j].recieveRating(rating);
			}
		}
	}
	String strr="",VideoName="";
	public void listInventory() {
		System.out.println("--------------------------------------------------------------");
		System.out.println(String.format("|%-20s|","Video Name") +String.format("%20s","Checkout")+String.format("|%20s","Rating"));
		for (int j=0;j<i;j++) {
			VideoName=store[j].getName();
			boolean Checkout=store[j].getcheckout();
			int rating = store[j].getRating();
			System.out.println(String.format("|%-20s|",VideoName) +String.format("%20s",Checkout)+String.format("|%20s",rating));

		}
		System.out.println("--------------------------------------------------------------");
	}
}
