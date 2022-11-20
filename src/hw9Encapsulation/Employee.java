package hw9Encapsulation;

public class Employee {
	private String empname;
	private int empage;
	private char empsex;
	private boolean usCitizen;
	
	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

	public char getSex() {
		return empsex;
	}

	public void setSex(char sex) {
		this.empsex = sex;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}

}
