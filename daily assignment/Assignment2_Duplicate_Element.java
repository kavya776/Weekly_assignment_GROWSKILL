package day4;

public class Assignment2_Duplicate_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Duplicate Elements:");
		int []arr= {10,20,30,20,40,10,50,30,60};
		int count=0;

		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
					count++;
					break;
		
				}
		System.out.print("\nCount of duplicate elements:"+count);


	}

}
