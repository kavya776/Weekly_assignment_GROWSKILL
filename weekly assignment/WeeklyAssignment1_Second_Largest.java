package day4;

public class WeeklyAssignment1_Second_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,45,7,89,34,89,56};
		int max=0;
		int max1=0;
		int firstLargest=0;
		int secondLargest=0;
		for(int i=1;i<arr.length;i++)
				if(arr[i]>firstLargest)
				{
					secondLargest=firstLargest;
					firstLargest=arr[i];
				}
				else if(arr[i]<secondLargest && arr[i]<firstLargest)
						secondLargest=arr[i];
		
		System.out.println("First Largest: "+firstLargest);
		System.out.println("Second Largest: "+secondLargest);

					
				}
	


		
				
				
	}


