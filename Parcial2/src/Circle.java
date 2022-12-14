
public class Circle extends Shape{
	
	private double radius;

	public Circle() {
		super();
		this.setRadius(1);
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
		return "Circle [radius=" + this.radius + " " + super.toString() + "]";
	}
	
	public double getArea() {
		double area = 3.14 * this.getRadius() * this.getRadius() ;
		System.out.println("El ?rea del c?rculo es de " + area + " cm.");
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 3.14 * this.getRadius();
		System.out.println("El per?metro del c?rculo es de " + perimeter + " cm.");
		return perimeter;
	}

}
