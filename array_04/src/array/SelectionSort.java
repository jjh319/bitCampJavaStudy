package array;


public class SelectionSort {

	
	public static void main(String[] args) {
		
		int[] ar = {35, 48, 25, 72, 50};
		
		System.out.print("정렬 전 : ");
		for(int data : ar) {
			System.out.print(data + "  ");
		} //for
		System.out.println();
		
		//Selection Sort
		
		for(int i=0; i<ar.length-1; i++) {
			
			for(int j=i+1; j<ar.length; j++) {
				
				if(ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				} // if
				
			} // inner for
			
		} // for
		System.out.print("정렬 후 : ");
		for(int data : ar) {
			System.out.print(data + "  ");
		} //for

	} // main

} // end class

/*
	정렬
	- 오름차순 (ASCENDING) : 1,2,3,....
	- 내림차순 (DESCENDING) : ....,3,2,1
*/