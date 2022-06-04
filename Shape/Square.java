package Shape;

public class Square extends Rectangle{
	Square(){
		super(0.0,0.0);
	}
	Square(double side){
		super(side,side);
	}
	Square(double side,String color, boolean filled){
		super(side,side, color, filled);
	}
	double calculateArea() {
		return getLength()*getLength();
	}
}
