package day4;

public class WeeklyAssignment3_Common_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int[] arr1= {30,40,60,70,50};
		
		System.out.print("Common Elements: ");
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr1.length;j++)
				if(arr[i]==arr1[j])
				{
					System.out.print(arr[i]+" ");
					break;
				}

	}

}
