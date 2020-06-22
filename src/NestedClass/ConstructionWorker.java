package NestedClass;

public class ConstructionWorker {

	private String name;
	private String type;
	private int yrsExperience;
	public ConstructionWorker(String name, String type, int yrsExperience) {
		
		this.name = name;
		this.type = type;
		this.yrsExperience = yrsExperience;
	}
	
	
	public void build(){
		System.out.println("build something.");
	}
	
	ToolsD toolEncap=new ToolsD();
	public void outerInner() {
		System.out.println("This is from outer class");
		toolEncap.doWork(DiffTools.SCREW_GUNS);
		
		
	}
	
	
	
	
	ToolsC tool= new ToolsC(){                    //anonymous inner class
		@Override
		public void doWork(DiffTools tools) {
			
			switch(tools) {
				case HAMMER: System.out.println("Use the head of the hammer to drive the nail into the wood.");
				break;
				case SCREW_DRIVER: System.out.println("Screw the screws much faster.");
				break;
				case PLIERS: System.out.println("Twist the wire or cut it.");
				break;
				case ELECTRIC_DRILLS: System.out.println("Make a round hole or drive in the fasteners.");
				break;
				case SCREW_GUNS: System.out.println("Install drywall or plywood.");
				break;
			}
		}
	};											//anonymous inner class
	
	
	protected static class ToolsA{				//static inner
		
		public void doWork(DiffTools tools) {
		
			switch(tools) {
				case HAMMER: System.out.println("Use the head of the hammer to drive the nail into the wood.");
				break;
				case SCREW_DRIVER: System.out.println("Screw or unscrew the screws.");
				break;
				case PLIERS: System.out.println("Twist the wire or cut it.");
				break;
				case ELECTRIC_DRILLS: System.out.println("Make a round hole or drive in the fasteners.");
				break;
				case SCREW_GUNS: System.out.println("Install drywall or plywood.");
				break;
				
		
			}
		}
	}											//static inner
	
		protected class ToolsB{					//non-static inner
		
			public void doWork(DiffTools tools) {
			
				switch(tools) {
					case HAMMER: System.out.println("Use the head of the hammer to drive the nail into the wood.");
					break;
					case SCREW_DRIVER: System.out.println("Screw or unscrew the screws.");
					break;
					case PLIERS: System.out.println("Twist the wire or cut it.");
					break;
					case ELECTRIC_DRILLS: System.out.println("Make a round hole or drive in the fasteners.");
					break;
					case SCREW_GUNS: System.out.println("Install drywall or plywood.");
					break;
					
				}
			}
		
		}										//non-static inner
		
		
		protected class ToolsC{					//using this to overwrite screw driver in anonymous
			
			public void doWork(DiffTools tools) {
			
				switch(tools) {
					case HAMMER: System.out.println("Use the head of the hammer to drive the nail into the wood.");
					break;
					case SCREW_DRIVER: System.out.println("Screw or unscrew the screws.");
					break;
					case PLIERS: System.out.println("Twist the wire or cut it.");
					break;
					case ELECTRIC_DRILLS: System.out.println("Make a round hole or drive in the fasteners.");
					break;
					case SCREW_GUNS: System.out.println("Install drywall or plywood.");
					break;
					
				}
			}
		}										//using this to overwrite screw driver in anonymous
			
		private class ToolsD{					//encapsulated inner class
			
			public void doWork(DiffTools tools) {
				
				switch(tools) {
					case HAMMER: System.out.println("Use the head of the hammer to drive the nail into the wood.");
					break;
					case SCREW_DRIVER: System.out.println("Screw or unscrew the screws.");
					break;
					case PLIERS: System.out.println("Twist the wire or cut it.");
					break;
					case ELECTRIC_DRILLS: System.out.println("Make a round hole or drive in the fasteners.");
					break;
					case SCREW_GUNS: System.out.println("Install drywall or plywood.");
					break;
			
				}
			}
		}										//encapsulated inner class
			
}


