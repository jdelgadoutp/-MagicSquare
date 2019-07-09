package MagicSquare;

import javax.swing.JOptionPane;

import com.sun.jndi.toolkit.ctx.PartialCompositeDirContext;

public class Magic {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog( "Ingrese su N para el Magic Square : " ));
		Square mySquare = new Square(n);
		Number myN = new Number(n);
		myN.VectorNumber();	
		myN.ListNumber();
		mySquare.MagicSquare();
	}

}
