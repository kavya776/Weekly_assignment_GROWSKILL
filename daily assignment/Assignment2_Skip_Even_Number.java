package day4;

public class Assignment2_Skip_Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		do {
			if(num>15) {
				break;
			}
			if(num%2==0) {
				num++;
				continue;
			}
			System.out.println(num);
			num++;
			
		}
		while(num<=20);
		
	}

}