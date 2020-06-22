package SingletonPractice;

public class SchoolTest {
 
		public static void main (String [] args) {
			
			School school1= School.getSchool();
			School school2= School.getSchool();
			School school3= School.getSchool();
			
			System.out.println(school1==school2);
			System.out.println(school1==school3);
			System.out.println(school3==school2);
			
			System.out.println();
			App app1= App.getApp();
			App app2= App.getApp();
			App app3= App.getApp();
			
			System.out.println(app1==app2);
			System.out.println(app1==app3);
			System.out.println(app3==app2);
			
			Principal principal1= Principal.INSTANCE;
			Principal principal2= Principal.INSTANCE;
			Principal principal3= Principal.INSTANCE;
			
			System.out.println();
			
			System.out.println(principal1==principal2);
			System.out.println(principal1==principal3);
			System.out.println(principal3==principal2);
		}
}
