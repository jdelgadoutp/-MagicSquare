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

	public void InserTree(Square newsquare, Number myN) {
		NodeTree newNode = new NodeTree(newsquare);
		if (this.root == null) {
			this.root = newNode;
		} else {
			InserNode(newsquare, myN);
		}
	}

	public void InserNode(Square newsquare, Number myN) {
		NodeTree newNode = new NodeTree(newsquare);
		newNode.setNumberChildren(1);
		this.root.setNumberChildren(this.root.getNumberChildren() + 1);
	}

}
