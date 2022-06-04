package Shape;

public class TestShape {
	public static void main(String args[]) {
		Circle c1= new Circle();
		Circle c2= new Circle(20.0);
		Circle c3= new Circle(20.0,"blue",false);
		
		System.out.println("Circle output\n");
		
		System.out.println("C1 is: radius- "+ c1.radius +"\tcolor- "+ c1.color+"\tfilled- "+c1.filled);
		System.out.println("C1 is: radius- "+ c2.radius +"\tcolor- "+ c2.color+"\tfilled- "+c2.filled);
		System.out.println("C3 is: radius- "+ c3.radius +"\tcolor- "+ c3.color+"\tfilled- "+c3.filled);
		System.out.println(c3.calculateArea());
		
		System.out.println("\nRectangle output\n");
		Rectangle r1= new Rectangle();
		Rectangle r2= new Rectangle(20.0,10.0);
		Rectangle r3= new Rectangle(20.0,10.0,"Green", false);
		System.out.println("R1 is: length- "+ r1.length +"\twidth- "+ r1.width+"\tcolor- "+ r1.color+"\tfilled- "+ r1.filled);
		System.out.println("R2 is: length- "+ r2.length +"\twidth- "+ r2.width+"\tcolor- "+ r2.color+"\tfilled- "+ r2.filled);
		System.out.println("R3 is: length- "+ r3.length +"\twidth- "+ r3.width+"\tcolor- "+ r3.color+"\tfilled- "+ r3.filled);
		System.out.println(r3.calculateArea());
		
		System.out.println("\nSquare output\n");
		Square s1= new Square();
		Square s2= new Square(10.0);
		Square s3= new Square(5.0,"Green", false);
		System.out.println("S1 is: side- "+ s1.length +"\tcolor- "+ s1.color+"\tfilled- "+ s1.filled);
		System.out.println("S2 is: side- "+ s2.length+"\tcolor- "+ s2.color+"\tfilled- "+ s2.filled);
		System.out.println("S3 is: side- "+ s3.length +"\tcolor- "+ s3.color+"\tfilled- "+ s3.filled);
		System.out.println(s3.calculateArea());
	}
}