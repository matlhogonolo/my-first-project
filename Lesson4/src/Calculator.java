import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out
					.println(" Enter 1 to add \n Enter 2 to substract \n Enter 3 to divide \n Enter 4 to Multiply \n");

			int input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println("answer = " + addition());
				break;
			case 2:
				System.out.println("answer = " + subtraction());
				break;
			case 3:
				System.out.println("answer = " + division());
				break;
			case 4:
				System.out.println("answer = " + multiply());
				break;
			default:
				System.out.println("Invalid INPUT");
				break;
			}

		}

	}
	
	public static int addition() {
		
		
		return 20+10;
		
	}
	
	public static int subtraction() {
		
		return 50-20;
		
		
		
	}
	public static int division() {
		

		return 100/50;
		
	}
	public static int multiply() {
		
		return 20*4;
	}
	
}


