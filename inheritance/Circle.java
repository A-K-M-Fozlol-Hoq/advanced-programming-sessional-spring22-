package inheritance;

public class Circle extends Shape {
	private double radius;
	private String color;
	public void seeColor() {
		color="black";
		super.color="red";
		System.out.println(color);
		System.out.println(this.color);
		System.out.println(super.color);
	}
	
	
	
}
