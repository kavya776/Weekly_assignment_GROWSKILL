package day1;

public class WeeklyAssignment8_Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1221;
		int num1=num;
		int rev=0;
		for(;num>0;) {
			int digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
			
		}
		System.out.println("Reverse number:"+rev);
		if(rev==num1) {
			System.out.println(rev +" is a palindrome number");
			
		}
		else {
			System.out.println(rev +" is not a palindrome number");

		}

	}

}
