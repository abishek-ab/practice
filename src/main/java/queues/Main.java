package queues;

public class Main {

	static class Queue {
		public int[] test = new int[10];
		public int head = -1;
		public int tail = -1;

		public void push(int data) {
			head=0;
			tail++;
			test[tail] = data;
		}

		public int pop() {
			int result = test[head];
			head++;
			return result;
		}

		public int peek() {
			return test[head];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue = new Queue();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		
		
		
		System.out.println(queue.peek());
		System.out.println(queue.pop());
		System.out.println(queue.peek());
		
		String s = "";
		for(int val:queue.test) {
			s = s+""+val+","; 
		}
		
		System.out.println(s);

	}

}
