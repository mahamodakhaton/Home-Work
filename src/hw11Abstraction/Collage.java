package hw11Abstraction;

public interface Collage {

	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default int dorm() {
		return 0;
	}

	public static String studyRoom() {
		return null;
	}

}
