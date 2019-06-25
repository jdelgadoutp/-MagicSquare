package MagicSquare;

import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.util.Iterator;

public class Square {

	private int[][] square;
	private int size;

	public int[][] getSquare() {
		return square;
	}

	public void setSquare(int[][] square) {
		this.square = square;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Square(int size) {
		this.square = new int[size][size];
		this.size = size;
	}

	public int K() {
		int k = 0;
		k = (int) (Math.pow(this.size, 3) + this.size) / 2;
		return k;
	}

	public int[][] add(int x, int y, int number) {
		this.square[x][y] = number;
		return this.square;
	}

	public int[][] del(int x, int y) {
		this.square[x][y] = 0;
		return this.square;
	}

	public int[][] Update(int x, int y, int number) {
		this.square[x][y] = number;
		return this.square;
	}

	public int[][] Clear() {
		for (int i = 0; i < square.length; i++) {
			for (int k = 0; k < square[i].length; k++) {
				this.square[i][k] = 0;
			}
		}
		return this.square;
	}

	public int SumRow(int x) {
		int sum = 0;
		for (int i = 0; i < square.length; i++) {
			sum += square[x][i];
		}
		return sum;
	}

	public int SumColumn(int y) {
		int sum = 0;
		for (int i = 0; i < square.length; i++) {
			sum += square[i][y];
		}
		return sum;
	}

	public int SumDiagonalP() {
		int sum = 0;
		for (int i = 0; i < square.length; i++) {
			for (int k = 0; k < square[i].length; k++) {
				if (i == k) {
					sum += square[i][k];
				}
			}
		}
		return sum;
	}

	public int SumDiagonalS() {
		int sum = 0;
		int k = this.size - 1;
		for (int i = 0; i < square.length; i++) {
			sum += square[i][k];
			k--;
		}
		return sum;
	}

	public boolean CheckSquare(Square mySquare) {
		boolean result = false;
		int count = 0;
		if (SumDiagonalP() == K()) {
			if (SumDiagonalS() == K()) {
				for (int i = 0; i < this.size; i++) {
					if (SumRow(i) == K()) {
						if (SumColumn(i) == K()) {
							count++;
						}
					}
				}
			}
		}
		if (count == this.size) {
			result = true;
			ListMagicSquare();
		}
		return result;
	}
	
	public void ListMagicSquare() {
		System.out.println("Magic Square:");
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				System.out.print(this.square[i][j] + "|");
			}
			System.out.println("");
		}
	}
}
