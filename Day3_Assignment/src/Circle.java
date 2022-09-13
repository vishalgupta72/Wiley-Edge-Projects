
public class Circle {

	double radius, area;
	
	public Circle() {
		radius = 0.0;
		area = 0.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		area = 3.14 * this.radius * this.radius;
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(10);
		System.out.print(circle.calculateArea());
		
		
	}

}
