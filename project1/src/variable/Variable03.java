package variable;

import java.util.Random;

public class Variable03 {

	
	public static void main(String[] args) {
		
		int big = Math.max(25, 36);
		System.out.println(big);
		
		double small = Math.min(12.3, 78.5);
		System.out.println(small);
		
		
		String num = "2";
		String num2 = "5";
		
		int sum2 = Integer.parseInt(num) + Integer.parseInt(num2);
		System.out.println(sum2);
		
		
		float a = Float.parseFloat("43.8f");
		double b = Double.parseDouble("43.8");
		System.out.println(a+b);
		
		
		
		int d = (int) ( (Math.random()) * 26 + 65);
		System.out.println(d);
		
		
		double e = new Random().nextDouble();
		System.out.println(e);
		
		
	} // main

} // end class
