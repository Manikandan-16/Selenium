package week1.day2.classroom;

public class CharOccurance {
	
	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
				String str = "welcome to chennai";
				int x,i;
				char n;
				char[] let=str.toCharArray();
				int alpha[]= new int[26];
				for( i=0;i<let.length;i++) 
				{
					if(let[i]!=' ') {
					x=(int)let[i]-'a';
					//System.out.println(x);
					alpha[x]++;
					}
					
					
				}
				
				for( i=0;i<alpha.length;i++) 
				{
					if(alpha[i]!=0) {
						n=(char)(97+i);
					System.out.println(n+" is present "+alpha[i]+" times");
					}
				}
				

				// declare and initialize a variable count to store the number of occurrences
			
				// convert the string into char array
				
				//get the length of the array
				
				// traverse from 0 till the array length 
				
					// Check the char array has the particular char in it 
					
					// if is has increment the count
						
					 
				
				// print the count out of the loop
					
	}

}