package Shape;

public class Shape {
	String color;
	boolean filled;
	Shape(){
		color="white";
		filled = true;
	}
	Shape(String color, boolean filled){
		this.color=color;
		this.filled =  filled;
	}
	
	double calculateArea() {
		return 1.0;
	}
	
}
