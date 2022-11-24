
public class Square extends Rectangle {
	
	private double side;

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(double side) {
		this.side = side;
		// TODO Auto-generated constructor stub
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled);
		this.side = side;
		// TODO Auto-generated constructor stub
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "width=" + "length=" + "]";
	}
	
	@Override
	public void setWidth(double side) {
		
	}
	
	@Override
	public void setLength(double side) {
		
	}

	
	
	
	
	
	

}
