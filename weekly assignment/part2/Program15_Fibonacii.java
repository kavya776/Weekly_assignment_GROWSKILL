package day1.part2;

public class Program15_Fibonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=0;
		int i2=1;
		int counter=10;
		System.out.print(i1+" "+i2+" ");
		for (int i=1; i<=counter-2;i++) {
			int num3=i1+i2;
			System.out.print(num3+" ");
			i1=i2;
			i2=num3;
			
		}
		
		

	}

}
