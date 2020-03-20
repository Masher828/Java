package service;

public class Video {
	public String videoName;
	boolean checkout=false;
	int rating=0;
	
	Video(String videoName){
		this.videoName=videoName;
	}
	String getName() {
			return this.videoName;
	}
	void doCheckout() {
		this.checkout=true;
	}
	void doReturn() {
		this.checkout=false;
	}
	void recieveRating(int rating) {
		this.rating = rating;
	}
	int getRating() {
		return this.rating;
	}
	boolean getcheckout() {
		return this.checkout;
	}
}
