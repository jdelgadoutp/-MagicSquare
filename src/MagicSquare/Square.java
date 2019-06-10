package MagicSquare;

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

	public int K(int n) {
		int k = 0;
		k = (int) (Math.pow(n, 3) + n) / 2;
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
		for (int i = square.length - 1; i >= 0; i--) {
			for (int k = 0; k < square[i].length; k++) {
				sum += square[i][k];
			}
		}
		return sum;
	}
}
