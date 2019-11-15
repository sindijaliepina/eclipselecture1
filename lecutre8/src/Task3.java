class Car2 {
	private String brand;
	private int maxspeed;
	private String color;
	
	public String getBrand() {
		return this.brand;
	}	public void setBrand(String brand) {
		this.brand = brand;
		}
	}

public class Task3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car2 car = new Car2();
		car.setBrand("Nothing special brand");
		String name = car.getBrand();
		System.out.println("My car name is " + name);
		
		
		
	}

}
