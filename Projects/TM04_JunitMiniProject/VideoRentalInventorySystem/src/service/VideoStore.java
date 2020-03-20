package service;

public class VideoStore{
	static int capacity=10;
	Video[] store = new Video[capacity];
	
	
	static int i=0;

	public String addVideo(String name) {
		if (i==store.length-1){
			Video[] store1 = new Video[store.length+10];
			for (int j=0;j<i;j++){
				store1[j]=store[j];
			}

			store=store1;
			System.out.println(store.length);
		}
		store[i]= new Video(name);
		store[i].checkout=false;
		store[i].rating=0;
		i++;
		return("Video \""+name+"\" added successfully.");
	}
	public String doCheckout(String name) {
		for(int j=0;j<i;j++) {

			if (store[j].getName().equals(name)) {
				store[j].doCheckout();
				return ("Video \""+name+"\" checked out successfully.");
			}
		}
		return " ";
	}
	public String doReturn(String name) {
		for (int j=0;j<i;j++) {
			if(store[j].getName().equals(name)) {
				store[j].doReturn();
				return ("Video \""+name+"\" returned successfully.");
			}
		}
		return " ";
	}
	public void setI(){
		i=0;
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
