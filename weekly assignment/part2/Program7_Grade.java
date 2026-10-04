package day1.part2;

public class Program7_Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=85;
		char grade='X';
		if (marks>=90 && marks<=100) 
			grade='A';
		else if(marks>=80 && marks<=89)
		    grade='B';
		else if(marks>=70 && marks<=79)
			grade='C';
		else {
			grade='D';
		}
		
		System.out.println("Grade:"+grade);
		
		
		    
	}

}
