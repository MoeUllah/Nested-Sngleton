package SingletonPractice;

public class App {

	private static App app= new App();
	
	private App() {};
	
	public static App getApp() {
		
		return app;
		
	}
}
