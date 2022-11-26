package hw12polymorphism;
public class TestFamily{


	public static void main(String[] args) { 
		   System.out.println("This sister family");
		
		Sister sister = new Sister();// This is void type.
		// Method overloads are called from sister class
		sister.sister();
		sister.sister(5,10,15,"17",19,21);
		sister.sister(5,10,15,"33");
		Sister.Sister(9, 6, 8, 7);
		sister.sister(7,9,11,16);
		
		Niece niece = new Niece();
		niece.sister();
		niece.sister(30,15,18,"25",20,35);
		niece.sister(15,20,25,"7");
		
		
		
		
	}
}
