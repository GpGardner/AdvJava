public class Main {
	

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.addNode(2, "f");
		tree.addNode(4, "e");
		tree.addNode(5, "c");
		tree.addNode(3, "b");
		tree.addNode(10, "d");
		tree.addNode(1, "a");

		tree.postOrderTraverseTree(tree.root);

		System.out.println("Search for 3");

		System.out.println(tree.findNode(5));
	}
}
