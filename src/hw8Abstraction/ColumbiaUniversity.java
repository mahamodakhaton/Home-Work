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
		
		/*
		 * yes we can inherit regular class to abstract class by key ward extend also
		 * we can inherit regular class to regular class by key word of extend 
		 * but we can not inherit regular class to interface class by key ward extend
		 * also we can inherit regular class and abstract class by extend key ward only one time
		 */


	}
}
