package hw8Abstraction;

import java.security.PublicKey;

public abstract class MedicalSchool {
	public abstract void anatomylab();

	public String anatomyLab; // This is default constructor

	// yes This is a constructor
	public MedicalSchool() {

		System.out.println("This Constructor is from Medical School");
	}

	// This is non abstract class

	public void biochemistryLab() {
		System.out.println("This method is non abstract class");

	}
}
