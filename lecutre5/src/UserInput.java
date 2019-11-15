import java.util.Scanner;

public class UserInput {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//			System.out.println("Enter number:");
//			scanner.nextDouble();
//			double input = scanner.nextDouble();
//			System.out.println(input);
//			
//			if (input<0){
//					System.out.println(input+ "is negative");
//			}else{
//				System.out.println(input + "is positive");
//			}
//			
//			
//
//	}

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);		
	System.out.println("Enter number:");		
	scanner.nextInt();
		int input = scanner.nextInt();
	System.out.println(input);
		
	if (input == 3){
			System.out.println(input+ "Wednesday");
	}else{
		System.out.println(input + "any other day of the week");
	} 
}
}


