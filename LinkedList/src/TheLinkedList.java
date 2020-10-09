public class TheLinkedList {

	Node head;

	public void insert(String data) {

		Node node = new Node(data, null);
		// node.data = data;
		// node.nextNode = null;

		if (head == null) {

			head = node;

		} else {

			Node currentNode = head;

			while (currentNode.nextNode != null) {

				currentNode = currentNode.nextNode;

			}

			currentNode.nextNode = node;

		}

	}

	public void removeAll(String data) {

		Node currentNode = head;
		Node lastNode = currentNode;

		while (currentNode.nextNode != null) {
			if (currentNode.data.equals(data)) {
				System.out.println("\nFound a " + data);
				displayNode(currentNode);

				// Memory Leak?
				lastNode.nextNode = currentNode.nextNode;
				currentNode = currentNode.nextNode;
				// currentNode.data = currentNode.nextNode.data;
				// currentNode.nextNode = currentNode.nextNode.nextNode;
			} else {
				lastNode = currentNode;
				currentNode = currentNode.nextNode;
			}

		}

		if (currentNode.data.equals(data)) {
			currentNode.data = null;
			currentNode = null;
			lastNode.nextNode = null;
		}

		// show();
	}

	public void show() {

		Node node = head;

		while (node.nextNode != null) {

			displayNode(node);

			node = node.nextNode;
		}

		displayNode(node);

	}

	public void displayNode(Node node) {

		System.out.println("\n------");
		System.out.println("Node: " + node + "\nCurrent Data: " + node.data + "\nNext Node: " + node.nextNode);
		System.out.println("------");
	}

	public static void main(String[] args) {
		TheLinkedList list = new TheLinkedList();

		list.insert("20");
		list.insert("21");
		list.insert("22");
		list.insert("22");
		list.insert("22");
		list.insert("23");
		list.insert("24");
		list.insert("24");
		list.insert("24");
		list.insert("25");
		list.insert("25");
		list.insert("25");
		list.show();
		System.out.println("\nBeing Removal\n");
		list.removeAll("22");
		list.removeAll("25");
		System.out.println("\nEnd Removal\n");

		list.show();
	}
}
