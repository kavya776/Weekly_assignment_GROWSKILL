package day4;

public class WeeklyAssignment5_Seperate_Positive_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-4, 7, 0, -2, 9, 0, -8, 5};
		for(int i=0;i<arr.length;i++)
			if(arr[i]>0)
			{
				System.out.print(arr[i]+" ");
			}
		for(int i=0;i<arr.length;i++)
			if(arr[i]<0)
			{
				System.out.print(arr[i]+" ");
			}
		for(int i=0;i<arr.length;i++)
			if(arr[i]==0)
			{
				System.out.print(arr[i]+" ");
			}
		

	}

}
