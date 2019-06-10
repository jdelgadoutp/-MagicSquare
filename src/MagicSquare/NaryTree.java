package MagicSquare;

public class NaryTree {

	private NodeTree root;

	public NodeTree getRoot() {
		return root;
	}

	public void setRoot(NodeTree root) {
		this.root = root;
	}

	public NaryTree(NodeTree root) {
		this.root = root;
	}

	public NaryTree() {

	}

	public void InserNode(Square newsquare) {
		NodeTree newNode = new NodeTree(newsquare);
		if (this.root == null) {
			newNode.setNumberChildren(0);
			this.root = newNode;
			
		}
	}

}
