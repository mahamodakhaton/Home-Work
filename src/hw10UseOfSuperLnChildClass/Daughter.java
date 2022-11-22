package hw10UseOfSuperLnChildClass;

public class Daughter extends Father {
	public String birthmonth;
	public int age;

	public Daughter() {
		super();
		System.out.println("This is default constructor from daughter class");

	}

	public Daughter(String birthmonth, int age) {
		super("Alex", 42, 'F', false, "Garcia");
		this.birthmonth = birthmonth;
		this.age = age;
		System.out.println("Birthmonth:" + birthmonth + "Age:" + age);

	}

	public void daughter() {
		super.father();
		System.out.println("This is method is from daughter class");
	}

	public void daughterinfo(String birthmonth, int age) {
		this.birthmonth = birthmonth;
		this.age = age;
		super.fatherinfo("Fahad", 52, 'M', false, "hamid");
		super.familyname = "Rahman";
		System.out.println("Birthmonth:" + birthmonth + "Age:" + age);
	}

}
