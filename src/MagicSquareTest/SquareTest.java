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
	
	@Test
	void testSumRow() {
		Square mySquare = new Square(3);
		mySquare.add(0, 0, 2);
		mySquare.add(0, 1, 8);
		mySquare.add(0, 2, 5);
		assertEquals(2, mySquare.getSquare()[0][0]);
		assertEquals(8, mySquare.getSquare()[0][1]);
		assertEquals(5, mySquare.getSquare()[0][2]);
		assertEquals(mySquare.SumRow(0),mySquare.K(3));
	}
	
	@Test
	void testSumColumn() {
		Square mySquare = new Square(3);
		mySquare.add(0, 0, 2);
		mySquare.add(1, 0, 8);
		mySquare.add(2, 0, 5);
		assertEquals(2, mySquare.getSquare()[0][0]);
		assertEquals(8, mySquare.getSquare()[1][0]);
		assertEquals(5, mySquare.getSquare()[2][0]);
		assertEquals(mySquare.SumColumn(0),mySquare.K(3));
	}
	
	@Test
	void testSumDiagonalP() {
		Square mySquare = new Square(3);
		mySquare.add(0, 0, 2);
		mySquare.add(1, 1, 8);
		mySquare.add(2, 2, 5);
		assertEquals(2, mySquare.getSquare()[0][0]);
		assertEquals(8, mySquare.getSquare()[1][1]);
		assertEquals(5, mySquare.getSquare()[2][2]);
		assertEquals(mySquare.SumDiagonalP(),mySquare.K(3));
	}
	
	@Test
	void testSumDiagonalS() {
		Square mySquare = new Square(3);
		mySquare.add(0, 2, 2);
		mySquare.add(1, 1, 8);
		mySquare.add(2, 0, 5);
		assertEquals(2, mySquare.getSquare()[0][2]);
		assertEquals(8, mySquare.getSquare()[1][1]);
		assertEquals(5, mySquare.getSquare()[2][0]);
		assertEquals(mySquare.SumDiagonalS(),mySquare.K(3));
	}

}
