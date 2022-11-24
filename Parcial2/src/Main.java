
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Shape s1 = new Circle("red", false, 5.5);
		System.out.println(s1);
		
		Circle s2 = new Circle();
		s2.setColor("blue");
		s2.setFilled(true);
		s2.setRadius(4);
		System.out.println(s2);
		
		Shape s3 = new Rectangle("red", false, 1, 2);
		System.out.println(s3);
		
		Shape s4 = new Square(6.6);
		System.out.println(s4);
		
		Circle c1 = new Circle();
		c1.setColor("violet");
		c1.setFilled(true);
		c1.setRadius(4);
		c1.getArea();
		c1.getPerimeter();
		
		Circle c2 = new Circle(6);
		c2.getArea();
		c2.getPerimeter();
		System.out.println(c2);
		
		Circle c3 = new Circle("pink", true, 8);
		c3.getArea();
		c3.getPerimeter();
		System.out.println(c3);
		
		Rectangle r1 = new Rectangle();
		r1.getArea();
		r1.getPerimeter();
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle(2,4);
		r2.setColor("orange");
		r2.setFilled(true);
		r2.getArea();
		r2.getPerimeter();
		System.out.println(r2);
		
		Rectangle r3 = new Rectangle("purple", true, 6, 3);
		r3.getArea();
		r3.getPerimeter();
		System.out.println(r3);
		
		Square sq1 = new Square();
		sq1.setWidth(1);
		sq1.setLength(1);
		sq1.getArea();
		sq1.getLength();
		System.out.println(sq1);
		
		Square sq2 = new Square(4);
		sq2.setWidth(0);
		sq2.setLength(0);
		sq2.getArea();
		sq2.getLength();
		System.out.println(sq2);
		
		Square sq3 = new Square(6);
		sq3.setWidth(0);
		sq3.setLength(0);
		sq3.getArea();
		sq3.getLength();
		System.out.println(sq3);
		
		

	}

}
