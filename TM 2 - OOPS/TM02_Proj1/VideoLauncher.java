import java.util.*;

class Video{
	private String videoName;
	private boolean checkout;
	private int rating;

	public String getName(){
		return videoName;
	}
	public void doCheckout(){
		checkout=true;
	}
	public void doReturn(){
		checkout=false;
	}
	public void receiveRating(int rating){
		this.rating=rating;
	}
	public int getRating(){
		return rating;
	}
	public boolean getCheckout(){
		return checkout;
	}
	Video(String name) {
		videoName = name;
	}
}

class VideoStore{
	private Video[] store;

	public int getStoreSize() {
		if (store != null) return store.length;
		else return 0;
	}
	
	public Video getLastAdded() {
		if (store != null) return store[store.length - 1];
		else return null;
	}

	public void addVideo(String name){
		Video video = new Video(name);
		int size;
		try{
			size=store.length;
		} catch (Exception e) {
			size=0;
		}
		Video[] newStore = new Video[size+1];
		newStore[size]=video;
		store=newStore;
	}

	public void doCheckout(String name){
		if(store==null || store.length==0){
			System.out.println("EMPTY STORE");
			return;
		} for(Video video:store) {
			if(video.getName().equals(name)) {
				video.doCheckout();
			}
		} 
	}

	public void doReturn(String name){
		if(store==null || store.length==0){
			System.out.println("EMPTY STORE");
			return;
		} for(Video video:store) {
			if(video.getName().equals(name)) {
				video.doReturn();
			}
		}
	}

	public void receiveRating(String name, int rating) {
		if (store == null || store.length == 0) {
			System.out.println("Store is empty");
			return;
		}
		
		for (Video video : store) {
			if (video.getName().equals(name)) {
				video.receiveRating(rating);
			}
		}
	}


	public void listInventory(){
		if(store==null || store.length==0){
			System.out.println("EMPTY STORE");
			return;
		} 

		for(int i=0;i<80;i++) {
			System.out.print("-");
		}
		System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", "VIDEO NAME", "CHEKOUT STATUS", "RATING");
		for(int i=0;i<80;i++) {
			System.out.print("-");
		}
		for (Video video : store) {
			System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", video.getName(), video.getCheckout(), video.getRating());
		}
		for(int i=0;i<80;i++) {
			System.out.print("-");
		}
	}

}
class VideoLauncher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VideoStore store = new VideoStore();
		int choice = 0;
		
		do {
			System.out.println( "\nMAIN MENU\n=========\n" +
								"1. Add Videos: \n" + 
								"2. Check Out Video: \n" + 
								"3. Return Video: \n" + 
								"4. Receive Rating: \n" + 
								"5. List Inventory: \n" + 
								"6. Exit: \n" + 
								"Enter your choice (1..6): ");
			choice = sc.hasNextInt() ? sc.nextInt() : 6;
			sc.nextLine();
			
			String name;
			
			switch (choice) {			
			case 1:
				System.out.print("Enter the name of the video you want to add: ");
				name = sc.nextLine();
				store.addVideo(name);
				System.out.println("Video " + "\""+name+"\"" + " added out successfully.");
				break;
			case 2:
				System.out.print("Enter the name of the video you want to Checkout: ");
				name = sc.nextLine();
				store.doCheckout(name);
				System.out.println("Video " + "\""+name+"\"" + " checked out successfully.");
				break;
			case 3:
				System.out.print("Enter the name of the video you want to Return: ");
				name = sc.nextLine();
				store.doReturn(name);
				System.out.println("Video " +"\""+name+"\"" + " returned successfully.");
				break;
			case 4:
				System.out.print("Enter the name of the video you want to Rate: ");
				name = sc.nextLine();
				System.out.print("Enter the rating for this video: ");
				int rating = sc.nextInt();
				store.receiveRating(name, rating);
				System.out.println("Rating " +"\""+rating+"\"" + " has been mapped to the Video " +"\""+ name +"\""+ ".");
				break;
			case 5:
				store.listInventory();
				break;
			default:
				System.out.println("Exiting...!! Thanks for using the application.");
				break;
			}
		} 
		while (choice != 6);
		sc.close();
}
}