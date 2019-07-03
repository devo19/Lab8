import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean isValid = true;
		String choice = "yes";
		int index;

		String[] names = { "Mike", "Jon", "Ellen", "Nandu", "Sajan", "Paula",
				"Tom", "Farid", "Shaan", "Modi" };

		String[] favFood = { "Pizza", "Burger", "Fries", "Brinjal", "Kebabs",
				"Taco", "Grilled Veges", "Tamarind", "Subs", "Chai" };

		String[] town = { "River Grove", "Canton", "Plymouth",
				"Livonia", "Novi", "Tarrytown", "White Plains",
				"Dubai", "The Bronx", "New Delhi" };

		System.out.println("Welcome!");

		while (choice.startsWith("yes")) {

			System.out
					.println("Which person would you like to know more about?");

			// show entire list of names
			for (int i = 0; i < names.length; i++) {
				System.out.println(i + 1 + "." + names[i]);

			}
			index = scnr.nextInt() - 1;

			while (index < 0 || index >= 10) {
				System.out.println("Enter a valid number (1-10)");
				index = scnr.nextInt() - 1;
			}

			scnr.nextLine(); // clears the scanner
			System.out.println("That is " + names[index]
					+ ". What would you like to know about " + names[index]
					+ "?" + "(enter \"hometown\" or \"favorite food\"): ");

			String input = scnr.nextLine();

			do {
				if (input.equalsIgnoreCase("hometown")) {
					System.out
							.println(names[index] + " is from " + town[index]);
					System.out
							.println("Would you like to know more ? enter \"yes\" or \"no\"");
					input = scnr.nextLine();

					if (input.equalsIgnoreCase("yes")) {
						System.out.println(names[index] + " likes "
								+ favFood[index]);
						break;
					} else {
						System.out.println("Thanks!");
						break;
					}

				} else if (input.equalsIgnoreCase("favorite food")) {
					System.out.println(names[index] + " likes "
							+ favFood[index]);
					System.out.println("Would you like to know more ? "
							+ "\"yes\" or \"no\" ");
					input = scnr.nextLine();

					if (input.equalsIgnoreCase("yes")) {
						System.out.println(names[index] + " is from "
								+ town[index]);
						break;
					} else {
						System.out.println("Thanks!");
						break;

					}

				} else {
					System.out.println("Error! Enter \"hometown\" " + "or"
							+ "\"favorite food\" or \"exit\"");
					input = scnr.nextLine();

					if (input.equalsIgnoreCase("exit")) {
						break;
					}
				}

			} while (isValid);

			System.out
					.println("Would you like to know about another person ? \"yes\" or \"no\"");
			choice = scnr.nextLine();

		}
		System.out.println("GoodBye!!");

	}

}
