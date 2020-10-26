public class BinaryTree {
	
	Node root;

	public void addNode(int key, String name){
		Node newNode = new Node(key, name);

		if(root == null){
			root = newNode;
		}else {
			Node focusNode = root;
			Node parent;
		
		while(true){
			parent = focusNode;
			if(key < focusNode.key){
				focusNode = focusNode.left;
				if(focusNode == null){
					parent.left = newNode;
					return;
				}
			}else {
				focusNode = focusNode.right;
				if(focusNode == null){
					parent.right = newNode;
					return;
				}
			}
		}
		}
	}

	public void sortByNumOrder(Node focusNode){
		if (focusNode != null) {
			sortByNumOrder(focusNode.left);
			System.out.println(focusNode);
			sortByNumOrder(focusNode.right);
		}
	}

	public void preOrderTraverseTree(Node focusNode){
		if (focusNode != null) {
			System.out.println(focusNode);
			preOrderTraverseTree(focusNode.left);
			preOrderTraverseTree(focusNode.right);
		}
	}
}
