
public class Rectangle extends Shape {
	
	private double width;
	private double length;

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	
	public double getArea() {
		double area = this.getLength() * this.getWidth();
		System.out.println("El área del rectángulo es de " + area + " cm.");
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 2 * this.getLength() + 2 * this.getWidth();
		System.out.println("El área del rectángulo es de " + perimeter + " cm.");
		return perimeter;
	}
	
	

}
