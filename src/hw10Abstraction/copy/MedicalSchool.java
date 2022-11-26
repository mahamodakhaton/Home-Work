package hw10Abstraction.copy;

public abstract class MedicalSchool extends NursingSchool implements LawSchool{
	public abstract void anatomylab();

	public String anatomylab ; // This is default constructor

	// yes This is a constructor
	public MedicalSchool() {

		System.out.println("This Constructor is from Medical School");
	}

	// This is non abstract class

	public void biochemistryLab() {
		System.out.println("This method is non abstract class");

		/*
		 * yes we can inherit abstract class to abstract class by key ward extend also
		 * we can inherit abstract class to regular class by key ward of extend but we
		 * can not inherit abstract class to interface class by key ward extend But can
		 * inherit abstract class and regular by extend key ward only one time
		 */

	}
}
