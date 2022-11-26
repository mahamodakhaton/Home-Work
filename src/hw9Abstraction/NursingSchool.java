package hw9Abstraction;

public abstract class NursingSchool extends RockefellerUniversity {
	public abstract void hygiene();// This is abstract method

	// This is non abstract class
	// Method implemented

	public void caring() {
		System.out.println("This method is from non abstract");
	}

}
