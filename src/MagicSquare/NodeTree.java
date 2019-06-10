package MagicSquare;

import java.util.*;;

public class NodeTree {

	private Square data;
	private ArrayList<NodeTree> children;
	private int numberChildren;

	public Square getData() {
		return data;
	}

	public void setData(Square data) {
		this.data = data;
	}

	public ArrayList<NodeTree> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<NodeTree> children) {
		this.children = children;
	}

	public int getNumberChildren() {
		return numberChildren;
	}

	public void setNumberChildren(int numberChildren) {
		this.numberChildren = numberChildren;
	}

	public NodeTree(Square data) {
		this.data = data;
		this.children = new ArrayList<NodeTree>();
		this.numberChildren = 0;
	}

}
