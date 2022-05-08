package tree;

public class TreeSort {

	static class Node {
		public int data;
		public Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	Node root;

	public void insert(int data) {
		this.root = insert(root, data);
	}

	Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
			return node;
		}

		if (data < node.data) {
			node.left = insert(node.left, data);
		} else {
			node.right = insert(node.right, data);
		}
		
		return node;
	}
	
	public void inOrderTrav(Node root) {
		if(root != null) {
			inOrderTrav(root.left);
			System.out.println(root.data);
			inOrderTrav(root.right);
		}
	}

	public static void main(String[] args) {
		
		TreeSort tree = new TreeSort();
		int[] test = {2,8,1,9,4,6};
		
		for(int val:test) {
			tree.insert(val);
		}
		
		tree.inOrderTrav(tree.root);
		

	}

}
