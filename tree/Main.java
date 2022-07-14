package tree;

public class Main {
	public static void main(String[] args) {
		BinaryTree br = new BinaryTree();

		br.insert(10);
		br.insert(20);
		br.insert(302);
		br.insert(303);
		br.insert(1);
		br.insert(51);
		br.insert(5);

		br.printTree(br.root);

		br.delete(1);
		System.out.println();
		br.printTree(br.root);

	}
}
