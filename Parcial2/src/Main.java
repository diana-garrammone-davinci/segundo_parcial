
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Circle circulo1 = new Circle("blue", true, 2);
		circulo1.getArea();
		circulo1.getPerimeter();
		System.out.println(circulo1);
		
		Rectangle rect1 = new Rectangle();
		rect1.getArea();
		rect1.getPerimeter();
		System.out.println(rect1);
		
		Square cuadrado1 = new Square(4);
		cuadrado1.setWidth(4);
		cuadrado1.getLength();
		System.out.println(cuadrado1);

	}

}
