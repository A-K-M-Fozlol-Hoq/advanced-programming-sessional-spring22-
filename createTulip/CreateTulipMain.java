package createTulip;

public class CreateTulipMain {
	public static void main(String[] args) {
		CreateTulip redTulip = new CreateTulip("red",2);
		CreateTulip whiteTulip = new CreateTulip("white",2);
		
		System.out.println("Properties of 1st tulip object: ");
		System.out.println(redTulip.getHeight()+"feet");
		System.out.println(redTulip.getColor());
		System.out.println("\nProperties of 2nd tulip object: ");
		System.out.println(whiteTulip.getHeight()+"feet");
		System.out.println(whiteTulip.getColor());
		CreateTulip mixedTulip1 = redTulip.mixTulip(whiteTulip);
		System.out.println("\nProperties of mixed tulip object: ");
		System.out.println(mixedTulip1.getHeight()+"feet");
		System.out.println(mixedTulip1.getColor());
		
	}
}
