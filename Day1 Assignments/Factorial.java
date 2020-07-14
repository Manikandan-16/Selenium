package week1.day1.classroom;

public class Factorial {
	
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1) Use of Datatype
	 * 2) For loop
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {

		int n=5,fact=1;
		for(int i=n;i>0;i--)
		{
			fact=fact*i;
		}
		
		System.out.println(fact);
		
	
	}

}
