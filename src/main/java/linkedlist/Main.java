package linkedlist;

public class Main {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.addItemAtHead(1);
		list.addItemAtHead(2);
		list.addItemAtHead(3);
		list.addItemAtHead(4);
		list.addItemAtHead(5);
		list.addItemAtHead(6);

		System.out.println(list);

		System.out.println(list.length());

		list.deleteHead();

		System.out.println(list);

		System.out.println(list.length());

		System.out.println(list.findItem(3));

		Node node = list.reverse();

		while (node != null) {
			System.out.print(node.getData() + " -> ");
			node = node.getNextNode();
		}
	}
}
