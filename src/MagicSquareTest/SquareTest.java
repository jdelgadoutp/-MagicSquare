package MagicSquareTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MagicSquare.Square;

class SquareTest {

	@Test
	void testCreateK() {
		Square mySquare = new Square(5);
		mySquare.K(4);
		assertEquals(mySquare.K(4), 34);
		mySquare.add(1, 1, 6);
		assertEquals(6, mySquare.getSquare()[1][1]);
	}

	@Test
	void testAdd() {
		Square mySquare = new Square(5);
		mySquare.add(1, 1, 6);
		assertEquals(6, mySquare.getSquare()[1][1]);
	}

	@Test
	void testDelete() {
		Square mySquare = new Square(5);
		mySquare.add(1, 1, 6);
		assertEquals(6, mySquare.getSquare()[1][1]);
		mySquare.del(1, 1);
		assertEquals(0, mySquare.getSquare()[1][1]);
	}

	@Test
	void testUpdate() {
		Square mySquare = new Square(5);
		mySquare.add(1, 1, 6);
		assertEquals(6, mySquare.getSquare()[1][1]);
		mySquare.Update(1, 1, 8);
		assertEquals(8, mySquare.getSquare()[1][1]);
	}
	
	@Test
	void testClear() {
		Square mySquare = new Square(5);
		mySquare.add(1, 1, 6);
		mySquare.add(1, 2, 6);
		assertEquals(6, mySquare.getSquare()[1][1]);
		mySquare.Clear();
		assertEquals(0, mySquare.getSquare()[1][1]);
		assertEquals(0, mySquare.getSquare()[1][2]);
	}

}
