package constructor;



class Hello{
	
	private String name;
	private int age;
	
	public Hello() {
		System.out.println("기본 생성자");
	} // constructor
	
	public Hello(String name) {
		this();
		System.out.println("이름 생성자");
		this.name = name;
	} // constructor
	
	public Hello(int age) {
		this("코난");
		System.out.println("나이 생성자");
		this.age = age;
		
	} // constructor
	
	
	
	
	public String getName() {
		return this.name;
	} // getName;
	
	public int getAge() {
		return this.age;
	} // getAge
	
} // end class


// --------------------------
public class Constructor01 {

	
	public static void main(String[] args) {
		
		Hello hello = new Hello();
		System.out.println(hello.getName() + "\t" + hello.getAge());
		System.out.println();
		
		Hello bb = new Hello("홍길동");
		System.out.println(bb.getName() + "\t" + bb.getAge());
		System.out.println();
		
		Hello cc = new Hello(25);
		System.out.println(cc.getName() + "\t" + cc.getAge());
		System.out.println();
		
		
		
	} // main

} // end class
