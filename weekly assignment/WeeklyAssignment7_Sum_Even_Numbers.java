package day1;

public class WeeklyAssignment7_Sum_Even_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		for(int i=2;i<=50;i++) {
			if(i%2==0) {
			 num1=num1+i;
				
			}
		}
		System.out.print("Sum of Even Numbers ="+num1);


	}

}
