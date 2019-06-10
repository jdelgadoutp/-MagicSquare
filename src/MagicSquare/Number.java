package MagicSquare;

public class Number {

	private int size;
	private int[] number;

	public int[] getNumber() {
		return number;
	}

	public void setNumber(int[] number) {
		this.number = number;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Number(int mysize) {
		this.size = mysize;
		this.number = new int[mysize];
	}

	public int[] VectorNumber() {
		int n = 0;
		for (int i = 0; i < this.number.length; i++) {
			n++;
			this.number[i] = n;
		}
		return this.number;
	}

	public int[] Del(int x) {
		this.number[x] = 0;
		return this.number;
	}

}
