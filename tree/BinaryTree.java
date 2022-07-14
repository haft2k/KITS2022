package tree;

public class BinaryTree {

	Node root;

	void insert(int data) {

		if (isEmpty()) {

			root = new Node(data);
			return;
		}

		Node parent = null;
		Node current = root;

		while (current != null) {
			// if data have in tree
			if (current.data == data)
				return;

			parent = current;
			if (current.data > data) {
				current = current.left;
			} else {
				current = current.right;
			}

		}

		if (parent.data > data) {
			parent.left = new Node(data);
		} else
			parent.right = new Node(data);

	}

	void delete(int data) {
		Node current = root, parent = root;
		boolean isLeftChild = false;

		if (current == null)
			return;

		while (current != null && current.data != data) {
			parent = current;

			if (current.data > data) {
				current = current.left;
				isLeftChild = true;

			} else {
				current = current.right;
				isLeftChild = false;
			}
		}

		// case 1: delete leaf
		if (current.data == data) {

			if (current.left == null && current.right == null) {
				if (isLeftChild) {
					parent.left = null;
				} else
					parent.right = null;
			}
			// case 2
			else if (current.right == null) {
				if (isLeftChild) {
					parent.left = current.right;
				} else parent.right = current.left;

			} else if (current.left == null) {
				if (isLeftChild) {
					parent.left = current.right;
				} else parent.right = current.left;

			}

		}
	}

	void printTree(Node node) {
		if (node == null) {
			return;
		}

		printTree(node.left);
		System.out.print(node.data + " ");
		printTree(node.right);
	}

	boolean isEmpty() {
		return root == null;
	}

}

class Node {
	int data;
	Node right, left;

	Node(int data) {
		this.data = data;
		this.right = this.left = null;
	}

}
