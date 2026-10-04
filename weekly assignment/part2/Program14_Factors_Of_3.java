package day1.part2;

public class Program14_Factors_Of_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=30;
		for(int i1=1;i1<=30;i1++) {
			if(i1==i)
				System.out.println(i);
			else if(i%i1==0)
				System.out.print(i1+",");
			
		}

	}

}
