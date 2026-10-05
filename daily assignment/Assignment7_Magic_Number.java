package day1;

public class Assignment7_Magic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=172;
		int sum=0;
		int n=num;
		System.out.println("Enter a number ="+num);
		 for(;n>0;n=n/10)
		 {
			 int digit=n%10;
			 sum=sum+digit;
				 
			 }
		 System.out.println("Digit sum =" +sum);
		 for (;sum>=10;) {
			 int temp=0;
			 for(;sum>0;sum=sum/10) {
				 int digit=sum%10;
				 temp=temp+digit;
			 }
			 sum=temp;
		 }
		 System.out.println("Final digit ="+sum);
		 if(sum==1)
			 System.out.println(num + " is a Magic Number");
		 else
			 System.out.println(num + " is not a Magic Number");



		 

	}

}
