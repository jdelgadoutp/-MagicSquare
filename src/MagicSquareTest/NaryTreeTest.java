package MagicSquareTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MagicSquare.NaryTree;
import MagicSquare.Square;

class NaryTreeTest {

	@Test
	void testAddNode() {
		NaryTree myNaryTree = new NaryTree();
		Square mySquare = new Square(3);
		mySquare.add(0, 0, 1);
		myNaryTree.InserNode(mySquare);
		assertEquals(myNaryTree.getRoot().getData().getSquare()[0][0], mySquare.getSquare()[0][0]);
	}

}
