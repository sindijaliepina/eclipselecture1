class Car {
	String color;
	int speed;
	String name;

	void drive() {
		System.out.println("drive name " + this.name);
	}
}

public class Repeating {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.name = "MySuperDuperCar";
		myCar.drive();
		Car stolenCar = new Car();
		stolenCar.name = "StolenCar";
		stolenCar.drive();
	}
}