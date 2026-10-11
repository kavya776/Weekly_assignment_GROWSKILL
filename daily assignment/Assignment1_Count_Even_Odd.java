package day4;

public class Assignment1_Count_Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {11,24,35,42,56,67,80,93};
		
		int odd=0;
		int even=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) 
				even++;
			else
				odd++;
			
			
			
		}
		System.out.println("Even number: " +even);
		System.out.println("Odd number: " +odd);

		

	}

}
