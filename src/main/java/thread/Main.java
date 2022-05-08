package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		List<CompletableFuture<Void>> futureList = new ArrayList<CompletableFuture<Void>>();

		futureList.add(CompletableFuture.runAsync(() -> new Batting().get()));
		futureList.add(CompletableFuture.runAsync(() -> new Bowling().get()));
		futureList.add(CompletableFuture.runAsync(() -> new Fielding().get()));

		CompletableFuture.allOf(futureList.toArray(new CompletableFuture[futureList.size()])).join();
		
		
		CompletableFuture future = CompletableFuture.runAsync(() -> new Bowling().get());
		
		future.thenRun(() -> System.out.println("YES")).join();

		System.out.println("DONE");
	}

}
