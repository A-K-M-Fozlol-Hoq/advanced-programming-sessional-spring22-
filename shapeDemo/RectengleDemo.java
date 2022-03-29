package shapeDemo;



	public class RectengleDemo {
	    public static void main(String args[]) {
	        Rectangle r1 = new Rectangle();
	        Rectangle r2 = new Rectangle(12.0f, 13.0f);
	        System.out.println("Length of Rectangle1: " + r1.getLength());
	        System.out.println("Width of Rectangle1: " + r1.getWidth());
	        System.out.println("Area Rectangle1: " + r1.getArea());
	        System.out.println("Perimeter Rectangle1: " + r1.getPerimeter());
	        System.out.println(r1.toString());

	        System.out.println("Length of Rectangle2: " + r2.getLength());
	        System.out.println("Width of Rectangle2: " + r2.getWidth());
	        System.out.println("Area Rectangle2: " + r2.getArea());
	        System.out.println("Perimeter Rectangle1: " + r1.getPerimeter());
	        System.out.println("Perimeter Rectangle2: " + r2.getPerimeter());
	        System.out.println(r1.toString());
	    }

	}