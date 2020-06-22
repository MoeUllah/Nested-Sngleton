package AnimalOOP;

public interface Animal {
	static final String cellType="eukaryotic";
	static final String numOfCells="multicellular";
	static final String diet="heterotrophic";
	
	void rest(Season currentSeason);
	void move();
	void dietType();
	void getBodyTemp();
	
	public static void description() {
		System.out.println("Are " + Animal.cellType + ", " + Animal.numOfCells + " organisms that have a "
				+ diet + " diet.");
	}
	
}

