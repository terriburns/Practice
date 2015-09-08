/*
 * How Big? How Fast?
 * http://codekata.com/kata/kata03-how-big-how-fast/
 */
public class Kata03 {
	public static void main(String[] args){
		//How Big?
        //roughly how many binary digits (bit) are required for the unsigned representation of:
  
		//1,000
		//Log based 2 of 1000 -- aka 2^x=1000, solve for x
		int answer1=10;
		//1,000,000
		//1,000^2 = 1,000,000
		//10x2=20
		int answer2=20;
        ///1,000,000,000
		//1,000^3=1,000,000,000
		//10x3=30
		int answer3=30;
        //1,000,000,000,000
		//1,000^4=1,000,000,000,000
		//10x4=40
		int answer4=40;
        //8,000,000,000,000
		//same as above except x8. 8 requires 3 bits
		int answer5=43;
		
		//My town has approximately 20,000 residences. How much space is required to store the names, 
		//addresses, and a phone number for all of these (if we store them as characters)?
	}

}
