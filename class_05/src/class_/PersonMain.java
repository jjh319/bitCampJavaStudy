package class_;


class Person {
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	} // setName
	
	public void setAge(int age) {
		this.age = age;
	} // setAge
	
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	} // setData
	
	public void setData() {
		
	} // setData
	
	public String getName() {
		return name;
	} // getName
	
	public int getAge() {
		return age;
	} // getAge

	
	
	
} // end class


//---------------------------------------------
// --------------------------------------------
public class PersonMain {

	
	public static void main(String[] args) {
		Person aa = new Person();
		System.out.println("객체 aa = " + aa);
		
		aa.setName("장지훈");
		aa.setAge(27);
		
		System.out.println(aa.getName() + "\t" + aa.getAge());
		System.out.println();
		
		Person bb = new Person();
		bb.setName("코난");
		bb.setAge(13);
		
		System.out.println("객체 bb = " + bb);
		System.out.println(bb.getName() + "\t" + bb.getAge());
		
		Person cc = new Person();
		System.out.println("객체 cc = " + cc);
		cc.setData("라이언", 30);
		
		System.out.println(cc.getName() + "\t" + cc.getAge());
		
		Person dd = new Person();
		System.out.println("객체 dd = " + dd);
		dd.setData();
		
		System.out.println(dd.getName() + "\t" + dd.getAge());
		
		
		
	} // main

} // end class
