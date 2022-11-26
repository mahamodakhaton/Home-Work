package hw10Abstraction.copy;

public abstract class EngineeringSchool extends NYUniversity{
	public abstract void medicallab();;// This is abstract

	public class engineeringSchool { // This is default constructor
		public String mechanicalLabString;

	}

	// This is non abstract class
	// Method implemented

	public void computerLab() { 
		System.out.println(" This method is from computerLab");
	}

}
