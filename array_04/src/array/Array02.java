package array;


public class Array02 {

	
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "] = " + args[i]);
			System.out.println("문자열 크기 = " + args[i].length());
			System.out.println("첫번째 문자 = " + args[i].charAt(0));
			System.out.println("마지막 문자 = " + args[i].charAt(args[i].length()-1));
		} // for
		System.out.println();
		
		for(String data : args) {
			
			System.out.println(data);
			
		} // enhanced for
		
	} // main

} // end class
