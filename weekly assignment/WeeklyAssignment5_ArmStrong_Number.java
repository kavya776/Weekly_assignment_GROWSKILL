package day1;

public class WeeklyAssignment5_ArmStrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1634;
		int original=num;
		int noOfDigit=0;
		int armStrong=0;
		for(;num>0;) {
			noOfDigit++;
			num=num/10;
			 
		}
		num=original;
		for(;num>0;) {
			int lastDigit=num%10;
			int multiply=1;
			for(int i=1;i<=noOfDigit;i++)
				multiply=multiply*lastDigit;
			armStrong=armStrong+multiply;
			num=num/10;
			

		}
		
			System.out.println(armStrong +" is an Armstrong Number");

			
		}

	}


