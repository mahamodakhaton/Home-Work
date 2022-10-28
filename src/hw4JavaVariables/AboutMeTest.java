package hw4JavaVariables;


public class AboutMeTest {
	public static void main(String[] args) {
		
		AboutMe aboutMe = new AboutMe();// Constructor is initialized here
		// Variables are initialized
	
	aboutMe. name = "Mahamoda Khaton";
	aboutMe. age = 80;
	aboutMe. myHeight = 1.8345431f;
	aboutMe.sex = 'f';
	aboutMe. myGrade = 3.96784378349;
	aboutMe.myYearlySalary = 2112565636;	
	aboutMe.myBankBalance = 97654321345467L;
	aboutMe. myApartmentRent = 32398;
	aboutMe.aboutMeMethod();
	
	
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
	
	System.out.println("My Name: " + aboutMeAlex.name + "\nMy Age: " + aboutMeAlex.age + "\nMy Apartment Rent " + aboutMeAlex.myApartmentRent
			+ "\nYearly Salary: " + aboutMeAlex.myYearlySalary + "\nMy Bank Balance" + aboutMeAlex.myBankBalance + "Sex: " + aboutMeAlex.sex
			+ "\nMy Height: " + aboutMeAlex.myHeight + "\nMy Grade: " + aboutMe.myGrade);
}
			

	

          
	                 
		
		
		
	}	
	
		
	


