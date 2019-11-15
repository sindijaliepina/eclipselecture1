import java.util.Scanner;


public class dayIndexTask {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What day it is?");
		int  number = scanner.nextInt();
		String[] dayIndex = {"Monday", "Tuesday", "Wednseday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		if (number >=8){
			System. out.println("Wrong!");
		}else {System.out.println("Current day is " + dayIndex[number -1]);
				
			}
			
		}
		

	}

