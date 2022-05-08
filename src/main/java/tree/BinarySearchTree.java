package tree;

public class BinarySearchTree {

	public Node root;

//	public void add(Node node) {
//		if(root == null) {
//			root = node;
//			return;
//		}
//		
//		
//	}

	public Node find(Integer data) {
		if (root.data == data) {
			return root;
		}
		if (data > root.data) {
			Node current = root.right;
			return find(current.data);
		} else {
			Node current = root.left;
			return find(current.data);
		}
	}

}
