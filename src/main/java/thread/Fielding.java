package thread;

public class Fielding {

	public void get() {
		System.out.println("Calling API to get Fielding records");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Recieved Fielding records");
	}

}
