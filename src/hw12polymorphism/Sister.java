package hw12polymorphism;

public class Sister {
// This is void type method

	public void sister() {
		System.out.println(" This is void type method");
		
	}

	// This is parameterize return constructor
	public int sister(int age1, int age2, int age3,String age4,int age5,int age6) {
		int add = age1 + age2 + age3 + Integer.parseInt(age4)+ age5 + age6;
		System.out.println("multiply all ages :" + add);
		return add;
	}

	// This is parameterize constructor
	public int sister(int age1, int age2, int age3, String age4) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println("This area from sister :" + total1);
		return total1;

	}

	// This is static type
	public static int Sister (int age1, int age2, int age3 , int age5) {
		int total2 = age1 + age2 + age3 + age5;
		System.out.println("add all the ages :" + total2);
		return total2;
	}

	// This is final type
	public final int sister(int age1, int age2, int age3,  int age5) {
		int total4 = age1 + age2 + age3 + age5;
		System.out.println("This is class area" + total4);
		return total4;

	}

	
}

/*
 * When multiple method is created by the same name, but parameter are different
 * is called method overloading. Method overloading is also called static
 * polymorphism. Method overloading happen during compile time.
 */
