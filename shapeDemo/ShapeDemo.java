package shapeDemo;

public class ShapeDemo {
 public static void main(String[] args) {
	 Circle c1 = new Circle("green",12);
	 double area = c1.calculteArea();
	 System.out.println("Color="+c1.color+"Area="+area);
	 c1.setColor("yellow");
	 c1.setRadius(10);
	 area = c1.calculteArea();
	 System.out.println("Color="+c1.color+"Area="+area);
 }
}
