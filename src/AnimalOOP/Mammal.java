package AnimalOOP;
public abstract class Mammal implements Animal{

	private static final boolean hasHair=true;
	private static final String brainComposition="complex brain";
	private static final int chambersHearts=4;
	private static final boolean mammaryGlands=true;
	private static final String blood="warm-blooded";
	private String type;
	
	
	
	public Mammal(String type) {
		
		this.type = type;
	}

	@Override
	public void dietType() {
		System.out.println("Eats other organisms.");
		
	}
	
	public void getBodyTemp() {
		System.out.println("Are " + blood + " organisms.");
		
	}
	
	public void feedMilk() {
		if(mammaryGlands)
			System.out.println("Feeds their youngs milk.");
	}
	@Override
	public String toString() {
		if (hasHair) {
			String description=type + " are " + blood + " organisms that have a " + brainComposition + ", "
				+ "their heart has " + chambersHearts + " chambers and they have hair on thier body.";
			return description;
		}
		else return null;
	}
	
	
	
	
}
