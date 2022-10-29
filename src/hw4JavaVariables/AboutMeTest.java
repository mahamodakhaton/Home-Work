package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		
		AboutMe aboutMe1 = new AboutMe();// Constructor is initialized here
		// Variables are initialized
	
	aboutMe1.name = "Mahamoda Khaton";
	aboutMe1.age = 80;
	aboutMe1.myHeight = 1.8345431f;
	aboutMe1.sex = 'f';
	aboutMe1.myGrade = 3.96784378349;
	aboutMe1.myYearlySalary = 2112565636;	
	aboutMe1.myBankBalance = 97654321345467L;
	aboutMe1.myApartmentRent = 32398;
	
	aboutMe1.aboutMe();
	
	System.out.println("\n--------------------------------------------------\n");
	AboutMe aboutMeAlex  = new AboutMe();
	// Variables are initialized
	aboutMeAlex .name = "Alex";
	aboutMeAlex .age = 100;
	aboutMeAlex .myApartmentRent = 30005;
	aboutMeAlex .myYearlySalary = 476482364;
	aboutMeAlex.myBankBalance = 2658736472686l;
	aboutMeAlex.myHeight = 1.979f;
	aboutMeAlex.myGrade = 3.97568346;
	aboutMeAlex.sex = 'f';
	
	aboutMeAlex.aboutMe();
}
}			

	

          
	                 
		
		
		
		
	
		
	


