package day4;

public class WeeklyAssignment2_NonZero_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0, 5, 0, 3, 8, 0, 2, 9};
		int index=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]!=0)
			{
				arr[index]=arr[i];
				index++;
			}
		while(index<arr.length) {
			arr[index]=0;
			index++;

		}
        System.out.print("Array after moving zeros: ");
		for(int i=0;i<arr.length;i++)
	        System.out.print(arr[i]+" ");

			


	}

}
