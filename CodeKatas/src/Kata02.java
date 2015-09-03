/*
 * Karate Chop
 * http://codekata.com/kata/kata02-karate-chop/
 */

public class Kata02 {
    public static int binarySearch(int key, int min, int max, int[] list) {
    	if (max < min) {
    		//the set is empty
    		System.out.println("empty set");
    		return 	0;
    	}
    	else {
    		int middle = list.length/2;
    		
	    	if (key < list[middle] ){
	    		//lower half
	    		System.out.println("lower set");
	    		return binarySearch(key, min, middle - 1, list);
	    	}
	    	else if (key > list[middle]) {
	    		//upper half
	    		System.out.println("upper set");
	    		return binarySearch(key, middle + 1, max, list);
	    	}	    
	    	else {
	    	  //numberWeAreLookingFor == middle
	          return middle;
	    	}
    	}
	}
    public static void main(String[] args) {
    	//declare an array
    	int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 	
    	//ints min and max are INDEXES  + this method will return and INDEX   
    	System.out.println(myList.length);
    	System.out.println("The key can be found at index " + binarySearch(8, 0, 10, myList) + " of the array");   	
	}
}
