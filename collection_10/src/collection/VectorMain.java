package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = " + v.size());
		System.out.println("벡터 용량 = " + v.capacity());
		System.out.println();
		
		System.out.println("항목 추가");
		for(int i=1; i<=10; i++) {
			v.add(i + "");
			System.out.print( v.get(i-1) + "  ");
			
		} // for
		System.out.println();
		System.out.println("벡터 크기 = " + v.size());
		System.out.println("벡터 용량 = " + v.capacity());
		System.out.println();
		
		System.out.println("항목 1개 추가");
		v.addElement(5 + "");
		System.out.println("벡터 크기 = " + v.size());
		System.out.println("벡터 용량 = " + v.capacity());
		System.out.println();
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+ "  ");
		} // for
		System.out.println();
		
		System.out.println("마지막 항목 삭제");
		v.remove(10);
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "  ");
		} // while
		System.out.println();
		

	} // main

} // end class
