package nested;


public class Outer {

	private String name;
	
	public void output() {
		System.out.println("이름 = " + name + "\t나이 = " + new Inner().age);
	} // output
	
	class Inner {
		private int age;
		
		public void disp() {
			System.out.println("이름 = " + name + "\t나이 = " + age);
		} // disp
		
	} // end class
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.name = "홍길동";
		
		Outer.Inner inner = outer.new Inner();
		inner.age = 25;
		inner.disp();
		
		
		Inner inner2 = outer.new Inner();
		inner2.age = 30;
		inner2.disp();
		
		Inner inner3 = new Outer().new Inner();
		inner3.age = 35;
		inner3.disp();
	} // main
	
} // end class
