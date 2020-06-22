package AnimalOOP;

public class AnimalTest5 {
	public static void main(String[] args) {
		Mammal aGorilla= new Gorilla("black", "huge", true);
		Gorilla gorillaA= (Gorilla) aGorilla;
		System.out.println(aGorilla.toString());
		Animal.description();	
		aGorilla.getBodyTemp();
		aGorilla.dietType();
		gorillaA.eat();
		aGorilla.feedMilk();
		aGorilla.move();
		aGorilla.rest(Season.WINTER);
		gorillaA.climbTree(7);
		gorillaA.play();
		gorillaA.climbTree(10, true);
		
		System.out.println();
		
		Mammal aBear= new Bear("brown", "North America", "big");
		Bear bearA= (Bear) aBear;
		System.out.println(aBear.toString());
		Animal.description();	
		aBear.getBodyTemp();
		aBear.dietType();
		bearA.eat();
		bearA.feedMilk();
		aBear.move();
		aBear.rest(Season.WINTER);
		
		
		System.out.println();
		
		
		
		
	}
	
	
}
