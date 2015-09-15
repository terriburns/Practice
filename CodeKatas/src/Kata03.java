/*
 * How Big? How Fast?
 * http://codekata.com/kata/kata03-how-big-how-fast/
 */
public class Kata03 {
	public static void main(String[] args){
		//HOW BIG?
		//-----------------------------------------
        //roughly how many binary digits (bit) are required for the unsigned representation of:	
		//-----------------------------------------
		//SOLUTION: the exponent 2^x == the number of bits required! magic!
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
		
		//-----------------------------------------
		//My town has approximately 20,000 residences. How much space is required to store the names, 
		//addresses, and a phone number for all of these (if we store them as characters)?
		//-----------------------------------------
		String theAnswer;
		//1 character == 1 byte
		//Upper bound of name == 40 characters
		//Upper bound of address == 40 characters
		//Upper bound of phone number == 10 characters
		//for 20,000 residences 
		//(20,000)(40)(40)(10) == 320000000 characters
		//theAnswwer = 320000000 bytes. 
		
		//-----------------------------------------
		//I'm storing 1,000,000 integers in a binary tree. Roughly how many nodes and levels can I 
		//expect the tree to have? Roughly how much space will it occupy on a 32-bit architecture?
		//-----------------------------------------
		//log(1000000)=x, 2*x=number of nodes, x=#of levels
		String ANSWER; //below
		//int x;
		//int answerNumberOfNodes = 2^x;
		//int answerNumerOfLevels =x;
		
		//-----------------------------------------
		//HOW FAST?
		//-----------------------------------------
				
	}
}
