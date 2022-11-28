package hw9Abstraction;

interface Collage {

	public void commonRoom();

	public void laboratory();

	public void languageClub();

	public default void commonroom() {

	}

	public static void laboratory1() {

	}

}
