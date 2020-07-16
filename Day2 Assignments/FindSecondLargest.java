package week1.day2.classroom;



public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7,9,10};
		int max,min;
		if(data[0]>data[1])
		{
			max=data[0];
			min =data[1];
			}
		else
		{
			min=data[0];
			max =data[1];
			}
		
		
		for(int i=1;i<data.length;i++)
		{
			if(data[i]>max)
				{
				min=max;
				max=data[i];
				}
			else if(data[i]>min)
				min=data[i];
			
		}
		System.out.println(min);
		
	}

	
}
