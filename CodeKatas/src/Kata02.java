/*
 * Karate Chop
 * http://codekata.com/kata/kata02-karate-chop/
 * 
 */

public class Kata02 {
    public static int binarySearch(int key, int min, int max, int[] list) {
    	if (max < min) {
    		System.out.println("Key not found.");
    		return 	0;
    	}
    	else if (list.length==0) {
    		//the set is empty
    		System.out.println("The set is empty.");
    		return 0;
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
	    	  System.out.println("The key can be found at index " + middle +".");
	          return middle;
	    	}
    	}
	}
    public static void main(String[] args) {
    	//run tests
    	//declare an array
    	int[] testOneList = {}; 	
    	System.out.println("Test One");
    	System.out.println("Actual: " + Kata02Tests.shouldReturnFalseIfArrayIsEmpty(testOneList));
    	System.out.println("--------------------------------");
    	System.out.println("");
    	
    	int[] testTwoList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    	System.out.println("Test Two");
    	System.out.println("Actual: " + Kata02Tests.shouldReturnFalseIfNotFoundInSortedOddArray(testTwoList));
    	System.out.println("--------------------------------");
    	System.out.println("");
    	
    	int[] testThreeList = {1, 2, 3, 4};
    	System.out.println("Test Three");
    	System.out.println("Actual: " + Kata02Tests.shouldReturnFalseIfNotFoundInSortedEvenArray(testThreeList));
    	System.out.println("--------------------------------");
    	System.out.println("");
    	
    	int[] testFourList = {4, 8, 12, 16, 20, 24, 28, 32, 36, 40};
    	System.out.println("Test Four");
    	System.out.println("Actual: " + Kata02Tests.shouldReturnTrueIfFoundAsFirstInSortedArray(testFourList));
    	System.out.println("--------------------------------");
    	System.out.println("");
    	
    	int[] testFiveList = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
    	System.out.println("Test Five");
    	System.out.println("Actual: " + Kata02Tests.shouldReturnTrueIfFoundAtEndInSortedArray(testFiveList));
    	System.out.println("--------------------------------");
    	System.out.println("");
    	
    	int[] testSixList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    	System.out.println("Test Six");
    	System.out.println("Actual: " + Kata02Tests.shouldReturnTrueIfFoundInMiddleInSortedArray(testSixList));
    	System.out.println("--------------------------------");
    	System.out.println("");
    	   	
	}
}
