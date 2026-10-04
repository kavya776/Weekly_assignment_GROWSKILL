package day1;

public class WeeklyAssignment5_ArmStrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int num1=num;
		int sum=0;
		for(;num>0;num=num/10) {
			 int digit=num%10;
			 sum=sum+(digit*digit*digit);
			 
		}
		if(sum==num1)
			System.out.println(num1 +" is an Armstrong Number");
		else {
			System.out.println(num1 +" is not an Armstrong Number");

			
		}

	}

}
