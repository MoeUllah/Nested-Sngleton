package AnimalOOP;

public class Gorilla extends Mammal implements Herbivorous{

	private static final int numOfLegs=2;
	private static final int numOfHands=2;
	private static final String teethShape="broad";
	private static final String noseShape="huge nostrils";
	private String color;
	private String size;
	private boolean hasGroup;
	
	
	
	public Gorilla(String color, String size, boolean hasGroup) {
		super("Gorillas");
		this.color = color;
		this.size = size;
		this.hasGroup = hasGroup;
	}

	@Override
	public void move() {
		System.out.println("Walks with its " + numOfLegs + " legs and " + numOfHands + " hands"
				+ " using its knuckles.");
		
	}

	@Override
	public void rest(Season currentSeason) {
		System.out.println("Sleeps when its tired.");
		
	}

	public void climbTree(int x) {
		System.out.println("Climbs up the tree a height of " + x + " feet.");
		
	}
	public void climbTree(int x, boolean isTired ) {
		if(isTired)
			System.out.println("Climbs the tree a distance of " + x + " feet"
					+ " to get some sleep.");
		else System.out.println("Climbs the tree a distance of " + x + " to eat some leaves.");
		
		
	}
	@Override
	public void eat() {
		System.out.println("Eats primarily plants, nuts, fruits with its " + teethShape + " teeths."+ " Loves to eat bananas.");
		
	}
	public void play() {
		if(hasGroup==true)
			System.out.println("Plays with its troop members.");
		else System.out.println("Plays by itself.");
	}
	public String toString() {
		System.out.println(super.toString());
		String description="The gorilla is " + color + " color and is " + size + ".";
		return description;
		
	}
}
