package hw10UseOfSuperLnChildClass;
public class TestFamily {
	public static void main(String[] args)
	{System.out.println("\nDefault constructor is initialized here: \n");
	Daughter daughter1 = new Daughter();

	System.out.println("parameterized constructor is initialized here");
	Daughter daughter2 = new Daughter("January", 29);

	System.out.println("void type method is initilize");
	daughter2.father();

	System.out.println("\nparameterized method is initialized here:\n");
	daughter2.fatherinfo("Mohammed", 35, 'M', false,"hossain");
}

	
	}


