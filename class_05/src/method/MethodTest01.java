package method;


public class MethodTest01 {

	
	public static void main(String[] args) {
		MethodTest01 m = new MethodTest01();
		System.out.println("객체 m = " + m);
		System.out.println("객체 m = " + m.toString());
		//호출
		m.display();
		output();
	} // main
	
	public void display() {
		System.out.println("method...");
	} // display
	
	public static void output() {
		System.out.println("static method...");
	} // output

} // end class
