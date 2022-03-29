package shapeDemo;

public class Circle {
	public String color;
	public double radius;
	
	public Circle() {
		
	}
	public Circle(String color, double radius) {
		this.color= color;
		this.radius = radius;
	}
	public double calculteArea() {
		return Math.PI*(Math.pow(radius, 2));
	}
	public void setColor (String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setRadius (double radius) {
		this.radius = radius;
	}
	public double getRadius()  {
		return radius;
	}
}
