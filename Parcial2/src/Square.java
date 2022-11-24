
public class Square extends Rectangle {
	
	private double side;

	public Square() {
		super();
		this.setSide(1);
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
		//return "Square [side=" + side + "width=" + this.getWidth() + "length=" + this.getLength() + "]";
		return "Square[side=" + this.side + " " + super.toString() + "}";
		}
	
	@Override
	public void setWidth(double side) {
		super.setWidth(this.side);
		System.out.println(super.getWidth());
		
	}
	
	@Override
	public void setLength(double side) {
		super.setLength(this.side);
	}

	
	

	
	
	
	
	
	

}
