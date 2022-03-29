package BasicOOP;

public class Box {
	double length;
	double width;
	double height;
	
	Box(double length, double width, double height){
		this.length= length;
		this.width = width;
		this.height = height;
	}
	double getVolume() {
		return height*width*length;
	}
	void printVolume(double volume) {
		System.out.println(volume);
	}
}
