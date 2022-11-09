package hw6IfElseCondition01;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Voter {

	public static void main(String[] args) {
		int age = 18;

		if (age == 18) {
			System.out.println("i am a voter");
		} else if (age < 18) {
			System.out.println("i am not a voter");
		} else if (age > 18) {
			System.out.println("i am voter");
		} else {
			System.out.println("please enter a valid age");
		}

	}
}
