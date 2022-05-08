package thread;

public class Batting {

	public void get() {
		System.out.println("Calling API to get Batting records");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Recieved Batting records");
	}

}
