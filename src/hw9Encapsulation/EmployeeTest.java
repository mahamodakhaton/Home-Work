package hw9Encapsulation;

public class EmployeeTest {
	
	public static void main(String[]args) {
		Employee employee = new Employee();
	    employee.setEmpname("Mohammed A");
	    employee.setEmpage(32);
	    employee.setEmpage('M');
	    employee.setUsCitizen(false);
		
	
		System.out.println("/n The Employee Name is: " + employee.getEmpname() + ", Employee Age: " +  employee.getEmpage()+",/n Employee Sex: " +employee.getEmpage()+" and Is US Citizen? Ans: " +employee.isUsCitizen());

	}
	}



