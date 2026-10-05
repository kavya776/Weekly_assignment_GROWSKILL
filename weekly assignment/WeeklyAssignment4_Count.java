package day1;

public class WeeklyAssignment4_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=987654;
		int num=i;
		int count=0;
		int rev=0;
		for(;num>0;) {
			num=num/10;
			count++;
		}
		System.out.println("Original number:"+i);
		System.out.println("Number of digits:"+count);

	}

	}


