package day1;

public class Assignment6_Spy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1124;
		int sum=0;
		int product=1;
		System.out.println("Enter a number ="+num);
		
		for(int n=num;n>0;n=n/10) {
			int digit=n%10;
			sum=sum+digit;
			product=product*digit;
		}
		
		System.out.println("Sum of Digits = "+sum);
		System.out.println("Product of Digits = "+product);
		
		if(sum==product) {
			System.out.println(num + " is a Spy number");
		}
		else {
			System.out.println(num + " is not a Spy number");

		}

		

	}

}
