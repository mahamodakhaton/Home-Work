package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char stSex;
	public boolean stPragramar;
	public double  stgrade;
	// default constructor declared
	
	public Student() {
		System.out.println("This is default constructor is from studentclass");		
	}
	// parameterized Constructor declared

	public Student(String stName , int stID, char stSex, boolean stPragramar, double stgrade) {
		this.stName = stName;
		this.stID = stID;
		this.stSex = stSex;
		this.stPragramar = stPragramar;
		this.stgrade = stgrade;
		System.out.println("The Student Name is:" + stName + " Studen id:" + stID + " Student sex:" + stSex + " Student Pragramar:" + stPragramar + " Student Grade:" + stgrade);
	}
	

}
