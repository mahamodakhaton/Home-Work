package hw10Abstraction.copy;

public interface University extends College,Hospital {
     

	/*
	 * university interface can not inheritance College,School by keyword of
	 * implement University interface can extend College,School. Also University
	 * interface can implement regular class and abstract class by keyword of
	 * implement
	 * 
	 * ii)Abstract class can inheritance abstract class and regular class by keyword
	 * extend. But abstract class can not inheritance abstract class regular class
	 * by keyword implement. on the other hand abstract class can inheritance
	 * interface class by keyword implement
	 * 
	 * abstract class can inheritance interface class by keyword implement more than
	 * one by comma. 
	 * iii)Regular class can inherit regular class and abstract class
	 * by extend keyword
	 * 
	 * Regular class can inherit interface class by keyword of implement more than
	 * one to use comma
	 */


			
	 String gymnasium();// This is default method

	public static final int library = 1600;

	/*
	 * yes interface can inheritance in interface class by extend ward but interface
	 * cannot inherit regular class
	  
	 * also interface cannot inherit abstract class by extend ward.
	 
	 * interface can extend two class at a time by comma.
	 */


		
	public void classSize();

	public void playground();

	public void teacher();


// interface inside cannot create constructor
// only you can declare by static final

}



