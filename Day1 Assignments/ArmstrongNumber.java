package week1.day1.assignments;



public class ArmstrongNumber {

	

	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */

	

	public static void main(String[] args) {

		

		int n=153;
		int cal=0,rem,org;
		org=n;
		while(org>0)
		{
			rem=org%10;
			cal=cal+(rem*rem*rem);
			org=org/10;
			
		}
		if(n==cal)
			System.out.println("Yes it is a Armstrong number");
		else
			System.out.println("No it is not a Armstrong number");


	}



}