package hw5Q2Constructor;

public class Computer {
public String computerBrand;
public String computerOperatingSystem;
public String computerModel;
public String computerPrice;
public char computerGrade;
public boolean madeInUsa;
	
//default constructor declared

public  Computer() {
	System.out.println("This is default constructor for computer");
	
	// parameterized Constructor declared
	
}

public Computer(String computerBrand, String computerOperatingSystem, String computerModel, String computerPrice,
		char computerGrade, boolean madeInUsa) {
	
	this.computerBrand = computerBrand;
	this.computerOperatingSystem = computerOperatingSystem;
	this.computerModel = computerModel;
	this.computerPrice = computerPrice;
	this.computerGrade = computerGrade;
	this.madeInUsa = madeInUsa;
	
	System.out.println("This computer Brand is:" + computerBrand + "ComputerOperatingSystem:" + computerOperatingSystem + "ComputerModel:" + computerModel + "ComputerGrade:" + computerGrade + "Computerprice:" + computerPrice + "made in Usa:" + madeInUsa);
}

}

