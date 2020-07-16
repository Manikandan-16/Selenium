package week1.day1.assignments;



public class PrimeNumber {

	

	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */

	

	public static void main(String[] args) {



		int n= 17;
		boolean flag=true;

		for(int i=2;i<n/2;i++)
		{
			if(n%i == 0)
				flag=false;
		}
		if(flag)
			System.out.println("Prime number");
		else
			System.out.println("Not a Prime number");
	
		

   }

}