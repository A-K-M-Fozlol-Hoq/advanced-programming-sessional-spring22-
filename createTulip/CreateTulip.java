package createTulip;

public class CreateTulip {
	private String color;
	private double height;
	CreateTulip(){
		
	}
	CreateTulip(String color, double height){
		this.color = color;
		this.height = height;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setColor(double height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public double getHeight() {
		return height;
	}
	
	public CreateTulip mixTulip (CreateTulip anotherTulip) {
		CreateTulip newCreateTulip = new CreateTulip();
		newCreateTulip.height = (this.height + anotherTulip.height)/2;
		if(this.color =="red" && anotherTulip.color=="white") {
			newCreateTulip.color="pink";
		}
		return newCreateTulip;
	}
}
