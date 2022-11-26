package hw10UseOfSuperLnChildClass;
public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyname;

	public Father() {
		System.out.println("This is default constructor from father class");
	}
	public Father(String name, int age, char sex, boolean usCitizen, String familyname) {
		
			this.name = name;
			this.age = age;
			this.sex = sex;
			this.usCitizen = usCitizen;
			System.out.println("Name:" + name +"Age:" + age + "Sex:" + sex + " Us Citizen:" + usCitizen);
	}

	public void father() {
		System.out.println("This is void type method");
	}

	public void fatherinfo(String name, int age, char sex, boolean usCitizen, String familyname) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Name:" + name + "Age:" + age + "Sex:" + sex + " Us Citizen:" + usCitizen);
	}



	
	}


	
		
	






