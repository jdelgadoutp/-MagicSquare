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
		Square mySquare = new Square(6);
		Number myN = new Number(6);
		Square mySquare1 = new Square(6);
		Number myN1 = new Number(6);
		Square mySquare2 = new Square(6);
		Number myN2 = new Number(6);
		myN.VectorNumber();		
		myNaryTree.InserTree(mySquare,myN);
		myNaryTree.InserTree(mySquare1,myN1);
		myNaryTree.InserTree(mySquare2,myN2);
		assertEquals(myNaryTree.getRoot().getData().getSquare()[0][0], mySquare.getSquare()[0][0]);
	}

}
