import java.util.Scanner;


public class Circle {

	double radius;
	double area;
	double pi;
		double getRadius(){
				return radius;
				}
			
		double getArea(){
		return radius*2*Math.PI;
				
		}
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius = 2.0;
		System.out.println(circle.getArea());
		
		
	}
//		Scanner scanner = new Scanner(System.in);
//		Scanner.nextDouble();
//		System.out.println("Enter radius");
//		double radius = nextDouble();
//		double area = pi*(radius*radius);
//		System.out.println("Area of this circle is" +area);
//		

	}

