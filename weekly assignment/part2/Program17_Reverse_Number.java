package day1.part2;

public class Program17_Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=12345;
		for(;i1>0;) {
			int lastDigit=i1%10;
			i1=lastDigit/10;
		}
		System.out.println(i1);

	}

}
