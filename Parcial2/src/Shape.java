
public abstract class Shape {
	
	private String color;
	private boolean filled;
	
	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	
	public Shape() {
		
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	@Override
	public String toString() {
		return "Square [color=" + color + ", filled=" + filled + "]";
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();


}
