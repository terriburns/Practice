/*
 * Karate Chop
 * http://codekata.com/kata/kata02-karate-chop/
 * 
 * TODO:
 * 1. write tests
 */

public class Kata02 {
    public static int binarySearch(int key, int min, int max, int[] list) {
    	if (max < min) {
    		//the set is empty
    		System.out.println("empty set");
    		return 	0;
    	}
    	else {
    		int middle = (min+max)/2;
    		
	    	if (key < list[middle] ){
	    		//lower half
	    		return binarySearch(key, min, middle - 1, list);
	    	}
	    	else if (key > list[middle]) {
	    		//upper half
	    		return binarySearch(key, middle + 1, max, list);
	    	}	    
	    	else {
	    	  //numberWeAreLookingFor == middle
	    		System.out.println("its the middle");
	          return middle;
	    	}
    	}
	}
    public static void main(String[] args) {
    	//declare an array
    	int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 	
    	//ints min and max are INDEXES  + this method will return and INDEX   
    	System.out.println("The key can be found at index " + binarySearch(2, 0, 10, myList) + " of the array");   	
	}
}
