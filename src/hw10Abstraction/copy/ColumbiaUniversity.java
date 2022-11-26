package hw10Abstraction.copy;

public class ColumbiaUniversity extends MedicalSchool implements University,VocationalSchool{

	// This is default constructor

		public String Chemistry;
		public String Biology;

		// This is non abstract method
		// This method is implemented

		public void chemistry() {
			System.out.println("This is from non abstract method");

		}

		public void biology() {
			System.out.println("This is from biology class");

			// This is Regular class so we can not create abstract method

			// yes we can create constructor inside regular class
			
			/*
			 * yes we can inherit regular class to abstract class by key ward extend also
			 * we can inherit regular class to regular class by key word of extend 
			 * but we can not inherit regular class to interface class by key ward extend
			 * also we can inherit regular class and abstract class by extend key ward only one time
			 */


		}

	@Override
	public String dorm() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aeronauticalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playground() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void anatomylab() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void medicallab() {
		// TODO Auto-generated method stub
		
	}

	public void columbiaUniversityinfo() {
		// TODO Auto-generated method stub
		
	}

	public void commonroomRoom() {
		// TODO Auto-generated method stub
		
	}

	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String morgue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String gymnasium() {
		// TODO Auto-generated method stub
		return null;
	}

}
