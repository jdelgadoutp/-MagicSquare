package MagicSquareTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import MagicSquare.Number;

class NumberTest {

	@Test
	void testNum() {
		Number myNumber = new Number(25);
		myNumber.VectorNumber();
		assertEquals(25, myNumber.getNumber()[24]);
	}
	
	@Test
	void testDel() {
		Number myNumber = new Number(25);
		myNumber.VectorNumber();
		myNumber.Del(24);
		assertEquals(0, myNumber.getNumber()[24]);
	}

}
