package hw3JavaVariables;

public class AboutMe {
//variable Declare
	public String collegeName;
// variable initialize	
	public String name = "Mahamoda Khaton";
	public byte age = 80;
	public float myHeight = 1.8345431f;
	public char sex = 'f';
	public double myGrade = 3.96784378349;
	public boolean grduated = true;
	public Integer myYearlySalary = 2112565636;
	public long myBankBalance = 97654321345467L;
	public short myApartmentRent = 32398;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println("My name is " + aboutMe.name);
		System.out.println("My age " + aboutMe.age + " My sex " + aboutMe.sex + " My salary " + aboutMe.myYearlySalary);

	}
	//

}
