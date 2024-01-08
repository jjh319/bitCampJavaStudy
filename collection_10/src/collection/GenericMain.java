package collection;


public class GenericMain<T> {
	private T a;
	
	public T getA() {
		return a;
	} // getA
	
	public void setA(T a) {
		this.a = a;
	} // setA
	
	public static void main(String[] args) {
		GenericMain<String> aa = new GenericMain<String>();
		aa.setA("홍길동");
		System.out.println("이름 = " + aa.getA());
		
		GenericMain<Integer> bb = new GenericMain<Integer>();
		bb.setA(25);
		System.out.println("나이 = " + bb.getA());

	} // main

} // end class
