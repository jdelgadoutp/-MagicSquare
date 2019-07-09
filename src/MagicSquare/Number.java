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
		this.size = (int) Math.pow(mysize, 2);
		this.number = new int[this.size];
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

	public int[] Add(int x, int date) {
		this.number[x] = date;
		return this.number;
	}
	
	public void ListNumber() {
		System.out.print("Numbers : {");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]+ ",");			
		}
		System.out.print("}");
		System.out.println();
	}

}
