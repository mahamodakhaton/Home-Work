package hw10Abstraction.copy;

public interface Hospital {
	public default void morgue() {

	}

	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	String dorm();

	public static void pharmacy() {

	}

}
