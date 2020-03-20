package main;
import service.VideoStore;
import java.util.Scanner;
public class VideoLauncher {
	public static void main(String[] args) {
		VideoStore store = new VideoStore();
		Scanner in = new Scanner(System.in);
		int choice=1,rating=0,count=0,temp=1;
		String name=" 11";
		do {
			System.out.println("MAIN MENU\r\n" + 
					"=========\r\n" + 
					"1.Add Videos:\r\n" + 
					"2. Check Out Video :\r\n" + 
					"3. Return Video :\r\n" + 
					"4. Receive Rating :\r\n" + 
					"5. List Inventory :\r\n" + 
					"6. Exit :\r\n" + 
					"Enter your choice (1..6):");
			choice = Integer.parseInt(in.nextLine());
			
			switch(choice) {
			case 1:
				System.out.print("Enter the name of the video you want to add:");
				name=in.nextLine();
				System.out.print(store.addVideo(name));
				break;
			case 2:
				System.out.println("Enter the name of the video you want to check out: ");
				name=in.nextLine();
				System.out.println(store.doCheckout(name));
				break;
			case 3:
				System.out.println("Enter the name of the video you want to Return: ");
				name =in.nextLine();
				System.out.println(store.doReturn(name));
				break;
			case 4:
				System.out.println("Enter the name of the video you want to Rate: ");
				name = in.nextLine();
				System.out.println("Enter the rating for this video: ");
				rating = Integer.parseInt(in.nextLine());
				store.recieveRating(name,rating);
				break;
			case 5:
				store.listInventory();
				break;
			case 6:
				System.out.println("Exiting...!! Thanks for using the application.\r\n");
				choice =-1;
				System.exit(0);
			default :
				System.out.println("Incorrect choice, Try again");
			}
			
		}while(choice>0);
		in.close();
	}
}
