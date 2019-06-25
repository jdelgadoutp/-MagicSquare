package MagicSquareTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MagicSquare.NaryTree;
import MagicSquare.Square;
import MagicSquare.Number;

class NaryTreeTest {

	@Test
	void testAddNode() {
		NaryTree myNaryTree = new NaryTree();
		Square mySquare = new Square(3);
		Number myN = new Number(3);
		Square mySquare1 = new Square(3);
		Number myN1 = new Number(3);
		Square mySquare2 = new Square(3);
		Number myN2 = new Number(3);
		myN.VectorNumber();	
		myN1.VectorNumber();	
		myN2.VectorNumber();
		myNaryTree.InserTree(myN,mySquare,3);
		myNaryTree.InserTree(myN1,mySquare1,3);
		myNaryTree.InserTree(myN2, mySquare2, 3);
		assertEquals(myNaryTree.getRoot().getData().getSquare()[0][0], mySquare.getSquare()[0][0]);
		assertEquals(myNaryTree.getRoot().getChildren().get(0).getData().getSquare()[0][0], mySquare1.getSquare()[0][0]);
	}

}
