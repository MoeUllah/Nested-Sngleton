package SingletonPractice;

public class School {

	private static School school;
	
	private School() {};
	
	public static School getSchool() {
		
		if(school==null)
			school= new School();
		return school;
	}
}
