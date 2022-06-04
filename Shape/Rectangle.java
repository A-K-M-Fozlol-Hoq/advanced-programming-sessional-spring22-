package Shape;

public class Rectangle extends Shape{
	double length;
	double width;
	Rectangle(){
		length=1.0;
		width=1.0;
	}
	
	Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	Rectangle(double length,double width,String color, boolean filled){
		super(color, filled);
		this.length=length;
		this.width=width;
	}
	double getLength() {
		return this.length;
	}
	double calculateArea() {
		return this.length*this.width;
	}
}