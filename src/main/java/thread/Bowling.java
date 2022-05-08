package thread;

public class Bowling {

	public void get() {
		System.out.println("Calling API to get Bowling records");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Recieved Bowling records");
	}

}
