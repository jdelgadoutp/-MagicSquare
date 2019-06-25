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

	public void InserTree(Number myNumber,Square newsquare,int myN) {
		NodeTree newNode = new NodeTree(newsquare);
		if (this.root == null) {
			this.root = newNode;
			newsquare.ListmagicSquare();

		} else {
			InserNode(this.root,myNumber,newsquare, myN);
		}
	}

	public void InserNode(NodeTree actualRoot,Number myNumber,Square newsquare,int myN) {
		NodeTree newNode = new NodeTree(newsquare);
		newNode.setNumberChildren(1);
		actualRoot.setNumberChildren(actualRoot.getNumberChildren() + 1);
		actualRoot.getChildren().add(newNode);
	}
	
	
}