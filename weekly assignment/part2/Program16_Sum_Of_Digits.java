package day1.part2;

public class Program16_Sum_Of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=12345;
		int sum=0;
		for(;i>0;) {
			int lastDigit=i%10;
			sum=sum+lastDigit;
			i=i/10;
		}
		System.out.println(sum);

	}

}
