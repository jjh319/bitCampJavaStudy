package variable;

import java.text.DecimalFormat;

public class Compute {

	public static void main(String[] args) {
		
		int a = 320;
		int b = 258;
		
		int sum = a + b;
		
		int sub = a - b;
		
		int mull = a * b;
		
		double div = (double)  a / b;
		
		
		System.out.println(a + " + " + b + " = " + sum);
		
		System.out.println(a + " - " + b + " = " + sub);
		
		System.out.println(a + " * " + b + " = " + mull);
		
		System.out.printf(a + " / " + b + " = %.2f", div);
		
		System.out.println();
		
		System.out.printf(a + " / " + b + " = " + String.format("%.2f\n", div) );
		
		System.out.println(a + " * " + b + " = " + new DecimalFormat().format(mull) );

		
		
		
	} // main

} // end class 
