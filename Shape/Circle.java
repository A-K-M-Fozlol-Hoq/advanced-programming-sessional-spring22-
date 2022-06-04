package Shape;

public class Circle extends Shape{
	double radius ;
	Circle(){
		radius = 1.0;
	}
	Circle(double radius){
		this.radius = radius;
	}
	Circle(double radius,String color, boolean filled){
		super(color, filled);
		this.radius = radius;
	}
	double calculateArea() {
		return 3.1415*radius*radius;
	}
	
}