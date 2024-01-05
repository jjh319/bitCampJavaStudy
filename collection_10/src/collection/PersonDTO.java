package collection;


public class PersonDTO implements Comparable<PersonDTO> {

	private String name;
	private int age;
	
	public PersonDTO() {
		
	} // Constructor
	
	public PersonDTO(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	} // Constructor

	public String getName() {
		return name;
	} // getName

	public void setName(String name) {
		this.name = name;
	} // setName

	public int getAge() {
		return age;
	} // getAge

	public void setAge(int age) {
		this.age = age;
	} // setAge

	
	@Override
	public String toString() {
	    return "PersonDTO{" +
	            "name='" + name + '\'' +
	            ", age=" + age +
	            '}';
	} // toString
	
	
	
	@Override
	public int compareTo(PersonDTO p) {
		
		if(this.age < p.age) {
			return -1;
		} else if(this.age > p.age) {
			return 1;
		} else {
			return 0;
		} // if-else if-else
		
	} // compareTo
	
	
	
	
	
} // end class
