
public class Circle extends Shape{
	
	private double radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public double getArea() {
		double area = 3.14 * this.getRadius() * this.getRadius() ;
		System.out.println("El área del círculo es de " + area + " cm.");
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 3.14 * this.getRadius();
		System.out.println("El perímetro del círculo es de " + perimeter + " cm.");
		return perimeter;
	}

}
