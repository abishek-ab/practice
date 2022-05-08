package ds;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "First");
		map.put(2, "Second");
		
		map.entrySet().stream().forEach(val -> {
			System.out.println("My key "+val.getKey());
			System.out.println("My Val "+val.getValue());
		}); 

		System.out.println(map);

	}

}
