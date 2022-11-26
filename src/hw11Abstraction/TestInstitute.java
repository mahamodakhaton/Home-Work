package hw11Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
	 
			System.out.println("\n-----------------------------ColumbiaUniversity-------------------------\n");
			ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
			columbiaUniversity.biology();
		
			columbiaUniversity.lawInfo();
			columbiaUniversity.anatomyLab();
			columbiaUniversity.caring();
			columbiaUniversity.commonRoom();
			columbiaUniversity.laboratory();
			columbiaUniversity.languageClub();
			columbiaUniversity.emergencyRoom();
			columbiaUniversity.surgeryRoom();
			columbiaUniversity.cafeteria();
			columbiaUniversity.vocationalInfo();
			columbiaUniversity.classSize();
			columbiaUniversity.playground();
			columbiaUniversity.teacher();
			columbiaUniversity.biochemistryLab();
			columbiaUniversity.gymnasium();
			columbiaUniversity.vocationalInfo();

			System.out.println("\n-----------------------------University-------------------------\n");
			University university = new ColumbiaUniversity();
			University.classSize();
			University.playGround();
			University.teacher();
			university.gymnasium();
			university.library(); // Here static method of University Interface called by the class itself.
			university.commonRoom();
			university.laboratory();
			university.languageClub();
			university.dorm();
			university.emergencyRoom();
			university.surgeryRoom();
			university.cafeteria();
			university.morgue();

			System.out.println("\n-----------------------------MedicalSchool-------------------------\n");
			MedicalSchool medicalSchool = new ColumbiaUniversity();
			medicalSchool.anatomylab();
			medicalSchool.biochemistryLab();
			medicalSchool.hygiene();
			medicalSchool.caring();
			medicalSchool.lawInfo();


		}
	}

	


