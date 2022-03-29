package WeightDeterminer945;

public class Weight945 {
	public String itemName945;
	public double height945;
	public double weight945;
	
	public Weight945(){
		itemName945= null;
		height945= -1.0;
		weight945 = -1.0;
	}
	
	public Weight945(String itemName, double heigh, double weight) {
		itemName945= itemName;
		height945= heigh;
		weight945 = weight;
	}
	
	public String getWeight945() {
		if((height945 == 5 || height945 ==7) && weight945<20) {
			return "lightWeight";
		}else {
			return "heavyWeight";
		}
	}
					
}
