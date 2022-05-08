package linkedlist;

public class LinkedList {

	private Node headNode;

	public void addItemAtHead(int data) {
		Node node = new Node(data);
		node.setNextNode(headNode);
		this.headNode = node;
	}

	public int length() {
		Node current = headNode;
		int length = 0;

		while (current != null) {
			length++;
			current = current.getNextNode();
		}

		return length;
	}

	public void deleteHead() {
		this.headNode = headNode.getNextNode();
	}

	public Node findItem(int data) {
		Node element = headNode;

		while (element != null) {
			if (element.getData() == data) {
				return element;
			}
			element = element.getNextNode();
		}

		return null;
	}

	public Node reverse() {
		Node previous = null;
		Node current = headNode;
		Node next = null;

		while (current != null) {

			next = current.getNextNode();

			current.setNextNode(previous);

			previous = current;
			current = next;

		}
		return previous;
	}

//	public void addItem(int data) {
//		Node node = new Node(data);
//		if (this.headNode == null) {
//			headNode = node;
//		} else {
//			Node element = headNode.getNextNode();
//			if (element == null) {
//				headNode.setNextNode(node);
//			}
//			this.headNode = 
//		}
//	}

	public Node getHeadNode() {
		return headNode;
	}

	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}

	@Override
	public String toString() {
		String result = "";

		Node current = headNode;

		while (current != null) {
			result += current.toString();
			current = current.getNextNode();
		}

		return result;
	}

}
