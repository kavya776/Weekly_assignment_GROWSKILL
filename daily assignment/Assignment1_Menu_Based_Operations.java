package day4;

public class Assignment1_Menu_Based_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=3;
		int a=20;
		int b=5;
		do {
			switch(choice) {
			case 1:System.out.println("Addition = " + (a+b));break;
			case 2:System.out.println("Subtraction = " + (a-b));break;
			case 3:System.out.println("Multiplication = " + (a*b));break;
			case 4:System.out.println("Division = " + (a/b));break;
			case 5:System.out.println("Invalid = "+ "Exit");break;
	
		}
		}
		while(choice==5);
		
	}
	}




