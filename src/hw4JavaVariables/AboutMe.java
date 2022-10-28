package hw4JavaVariables;

public class AboutMe {
	// variable Declared.

	public String name;
	public byte age;
	public float myHeight;
	public char sex;
	public double myGrade;
	public boolean usCitizen;
	public Integer myYearlySalary;
	public long myBankBalance;
	public short myApartmentRent;

	
	
	// This is constructor.
	// here constructor declared.
	public AboutMe () {
		System.out.println("This is all about us:");

	}
    // this is method.
	// here method implemented.
	public void aboutMeMethod() {
		System.out.println("My Name: " + name + "\nMy Age: " + age + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance" + myBankBalance + "Sex: " + sex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}
	}


