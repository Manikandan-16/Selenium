package week1.day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		int a=2,b=3,c;
		char str='+';
		switch(str) {
		case '+' :
			c=a+b;
			System.out.println(c);
			break;
		case '-' :
			c=a-b;
			System.out.println(c);
			break;
		case '*' :
			c=a*b;
			System.out.println(c);
			break;
		case '/' :
			c=a/b;
			System.out.println(c);
			break;
		default :
			System.out.println("Please use any one of +,-,*,/ operators");
		}
		
	}

}