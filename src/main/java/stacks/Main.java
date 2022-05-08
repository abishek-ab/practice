package stacks;

public class Main {

	static class Stack {
		public int[] test = new int[10];
		public int top = -1;

		public void push(int data) {
			top++;
			test[top] = data;
		}

		public int pop() {
			int result = test[top];
			test[top] = 0;
			top--;
			return result;
		}

		public int peek() {
			return test[top];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		String s = "";
		for(int val:stack.test) {
			s = s+""+val+","; 
		}
		
		System.out.println(s);

	}

}
