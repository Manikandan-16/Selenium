package week1.day2.classroom;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		int i,j,temp;
		for(i=0;i<(arr.length- 1);i++)
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		for(i=1;i<arr.length;i++)
		{
			if(arr[i-1]!=i)
			{
				System.out.println(i);
				break;
			}
		}		

	}

}