
public class Kata02Tests {
	//TEST ONE
	public static boolean shouldReturnFalseIfArrayIsEmpty(int[] myArray){
		//what is the actual output of this test?
		boolean actual;
		//if the array is empty, binarySearch should return 0.
		if (Kata02.binarySearch(100, 0, 0, myArray) == 0) {
		    //what is the actual output of this test?
		    actual = false;
		}
		else {
			actual = true;
		}
		//what is the expected output of this test?
		boolean expected = false;
		System.out.println("Expected: " + expected);
	    return actual;	
	}
	//TEST TWO
	public static boolean shouldReturnFalseIfNotFoundInSortedOddArray(int[] myArray){
		//what is the actual output of this test?
		boolean actual;
		//if the key is not found, binarySearch should return 0.
		if (Kata02.binarySearch(100, 0, 9, myArray) == 0){
			actual = false;
		}
		else {
			actual = true;
		}
		//what is the expected output of this test?
		boolean expected = false;
		System.out.println("Expected: " + expected);
		return actual;
	}
	//TEST THREE
	public static boolean shouldReturnFalseIfNotFoundInSortedEvenArray(int[] myArray){
	    //what is the actual output of this test?
		boolean actual;
		//if the key is not found, binarySearch should return 0.
		//even sized array
		if (Kata02.binarySearch(100, 0, 3, myArray) == 0){
			actual = false;
		}
		else {
			actual = true;
		}
		//what is the expected output of this test?
		boolean expected = false;
		System.out.println("Expected: " + expected);
		return actual;
	}
	//TEST FOUR
	public static boolean shouldReturnTrueIfFoundAsFirstInSortedArray(int[] myArray){ 
		//what is the actual output of this test?
		boolean actual;
		if (Kata02.binarySearch(4, 0, 9, myArray) == 0){
			actual = true;
		}
		else {
			actual = false;
		}
		//what is the expected output of this test?
		boolean expected = true;
		System.out.println("Expected: " + expected);
		return actual;
	}
	//TEST FIVE
	public static boolean shouldReturnTrueIfFoundAtEndInSortedArray(int[] myArray){
		//what is the actual output of this test?
		boolean actual;
		if (Kata02.binarySearch(30, 0, 9, myArray) == 9){
			actual = true;
		}
		else {
			actual = false;
		}
		//what is the expected output of this test?
		boolean expected = true;
		System.out.println("Expected: " + expected);
		return actual;
	}
	//TEST SIX
	public static boolean shouldReturnTrueIfFoundInMiddleInSortedArray(int[] myArray){
		//what is the actual output of this test?
		boolean actual;
		//if the index is 5
		if (Kata02.binarySearch(6, 0, 10, myArray) == 5){
			actual = true;
		}
		else {
			actual = false;
		}
		//what is the expected output of this test?
		boolean expected = true;
		System.out.println("Expected: " + expected);
		return actual;
	}
}
