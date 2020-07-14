package week1.day1.classroom;

public class SumOfDigits {

	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123
	 * output: 1+2+3 = 6
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */

	public static void main(String[] args) {

		int n=123,sum=0,x;
		while(n>0)
		{
		x=n%10;
		sum+=x;
		n=n/10;
		}
		
		System.out.println(sum);
	}

}