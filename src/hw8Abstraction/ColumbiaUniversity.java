package hw8Abstraction;

import java.security.PublicKey;

public class ColumbiaUniversity {

	// This is default constructor

	public String Chemistry;
	public String Biology;

	// This is non abstract method
	// This method is implemented

	public void chemistry() {
		System.out.println("This is from non abstract method");

	}

	public void biology() {
		System.out.println("This is from biology class");

		// This is Regular class so we can not create abstract method

		// yes we can create constructor inside regular class

	}
}
