package NestedClass;


public class TestConWorker {

	public static void main(String[] args) {
		
		ConstructionWorker worker= new ConstructionWorker("Joe", "Plumber", 10);
	
		System.out.println("Non-static inner class");
		System.out.println();
		
		ConstructionWorker.ToolsB tool1= worker.new ToolsB();  //instance method
		tool1.doWork(DiffTools.HAMMER);
		
		System.out.println();
		System.out.println("Static inner class");
		System.out.println();
		
		ConstructionWorker.ToolsA tool2= new ConstructionWorker.ToolsA(); //static method
		tool2.doWork(DiffTools.PLIERS);

		System.out.println();
		System.out.println("Anonymous inner class overwrote screw driver");
		System.out.println();
		
		ConstructionWorker.ToolsC toolAnonymous= worker.tool;	//anonymous inner class, tested with screw driver.
		toolAnonymous.doWork(DiffTools.SCREW_DRIVER);
		
		System.out.println();
		System.out.println("Inner class encapsulated and called using outer class method.");
		System.out.println();
		
		ConstructionWorker worker1= new ConstructionWorker("Joe", "Plumber", 10); //encapsulated inner class use
		worker1.outerInner();													  //encapsulated inner class use
	}

}
