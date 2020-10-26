public class Node {
	int key;
	String name;

	Node left;
	Node right;

	public Node(){}

	public Node(int value, String name){
		this.key = value;
		this.name = name;
	}

	@Override
	public String toString(){
		return name + " has a key: " + key;
	}

}

