package day4;

public class WeeklyAssignment4_Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,5,6,7,8,9,10};
		int n=10;
		int actualSum=0;
		int expectedSum=(n*(n+1))/2;
		for(int i=0;i<arr.length;i++) {
			actualSum=actualSum+arr[i];
		}
		int missingSum=expectedSum-actualSum;
		System.out.println("Missing number:"+missingSum);

		

		

	}
	

}
