package week1.day2.classroom;

public class ReverseString {
	
public static void main(String[] args) {
		
		// Here is the input
		String test = "feeling good";
		char[] arr=test.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}

}