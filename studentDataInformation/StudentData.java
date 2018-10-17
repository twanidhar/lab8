package studentDataInformation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);

		String[] students1 = { "Grace", "Joe", "Lewis", "Sarah", "Annie", "Mary", "Jon", "Alice", "Matt", "Sam" };

		int[] rollCall = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		String[] food1 = { "pizza", "salad", "spagetti squash", "sandwhich", "pasta", "chow mein noodles",
				"rice and beans", "burritos", "chicken nuggets", "fish sticks" };

		String[] hometown1 = { "Detroit", "Warren", "Brooklyn", "Saint Clair Shores", "Troy", "Sterling Heights",
				"Dallas", "Chicago", "Roseville", "Saginaw" };

		System.out.println("Which student would you like to learn about?");

		System.out.println("Enter a rollCall number to know something interesting about your classmate!");

		int userSelection = scnr.nextInt();

		System.out.println(students1[userSelection - 1] + ", Awesome!");
		{
			System.out.println(
					"Do you want to know what " + (students1[userSelection - 1]) + "'s " + "favorite food is?");
			
			String userResponse1 = scnr.next();
			boolean userReturned = userResponse1.equals("yes");

			if (userReturned(userResponse1.equals("yes"))) {
				userResponse1 = scnr.nextLine();
				System.out.println(students1[userSelection - 1] + " likes " + food1[userSelection - 1] + ".");
			} else {
				System.out.println("If no, do you want to know where you're classmate is from?");
				userResponse1 = scnr.nextLine();
			}
			if (userReturned(userResponse1.equals("yes"))) {
				userResponse1 = scnr.nextLine();
				// String[] hometown1 = scnr.nextLine();
				// int studentsAreFrom = 0;
				{
					for (int i = 0; i < hometown1[i].length(); i++) {

						System.out.println("You're classmate is from " + hometown1);
					}
				}
			}
		}
	}
	

	private static boolean userReturned(boolean equals) {
		// TODO Auto-generated method stub
		return false;
	}


	private static String[] favoriteFood(String[] food) {
		return food;
	}

	private static String[] studentsAreFrom(String[] hometown) {

		return hometown;

	}

	private static int rollCallNumbers(String[] rollcall) {
		int number = 0;
		return number;
	}

}
