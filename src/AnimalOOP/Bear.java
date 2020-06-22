package AnimalOOP;

public class Bear extends Mammal implements Omnivorous{

	private static final int numOfLegs=4;
	private static final boolean clawsRetracted=false;
	private static final String noseShape="long snout";
	private static final String earShape="two rounded ears";
	private static final String tailType="short tail";
	private String color;
	private String location;
	private String bodySize;
	
	
	
	public Bear(String color, String location, String bodySize) {
		super("Bears");
		this.color = color;
		this.location = location;
		this.bodySize = bodySize;
	}

	public void rest(Season currentSeason) {
		
		if(currentSeason==Season.WINTER)
			System.out.println("Hibernates during the winter.");
		else System.out.println("Sleeps when its tired.");
	
	}

	@Override
	public void move() {
		if(!clawsRetracted)
			System.out.println("Walks on its " + numOfLegs + "legs. As the bear"
					+ " walks it's footprints contain markings of it claw.");
		
	}
	
	
	
	public String toString() {
		System.out.println(super.toString());
		String description="The " + color + " bear is from " + location + "." + " It's a " + bodySize 
				+ " bear. The bear has " + earShape + ", a " + noseShape + " and a " + tailType + ".";
		
		return description;
		
		
	}

	@Override
	public void eat() {
		System.out.println("Eats both plants and other animals.");
		
	}

}
