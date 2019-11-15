import java.util.Scanner;

class User {
	// fileds 
	String name;
	int age;
	boolean man;
	int number;
	
	void sayHello(){
		System.out.println("Hi, my name is " + name + " I'm " + age + " old" + man + "my phone number is " + number);
	}
}

public class JavaClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String name = "Peter";
		int age = 21;
		boolean man = false;
		
		
		String name1 = "Anna";
		int age2 = 22;
		boolean man2 = true;
		int number = 278463;
		User peter = new User();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		scanner.nextLine();
		
		
		peter.name = "Peter";
		peter.age = 21;
		peter.man = true;	
		peter.number = 462738;
		peter.sayHello();	
		
		
		User anna = new User();
		anna.name = "Anna";
		anna.age = 20;
		anna.man = false;
		anna.number = 278463;
		anna.sayHello();
			
		
		
	}

}
