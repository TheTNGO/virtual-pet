package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/* New pet creation */

		System.out.println("Welcome, and say \"Hi!\" to your new virtual dog!");
		System.out.println("Give your pet a name!");
		String nameInput = input.nextLine();
		VirtualPet pet = new VirtualPet(nameInput);

		System.out.println();
		System.out.println(pet.getName() + " wags its tail at you. It seems to like that name!\n");

		/* Main Game Loop */

		while (true) {

			String choice = "";

			// Name Heading

			for (int i = 0; i < pet.getName().length(); i++) {
				System.out.print("*");
			}
			System.out.println("\n" + pet.getName() + "");
			for (int i = 0; i < pet.getName().length(); i++) {
				System.out.print("*");
			}

			// Stats Heading

			System.out.println("\nNutrition: " + pet.getStatNutrition());
			System.out.println("Energy: " + pet.getStatEnergy());
			System.out.println("Mood: " + pet.getStatMood());

			// Input Options

			System.out.println("\n" + pet.getName() + " looks at you in anticipation.");
			System.out.println("What would you like to do with " + pet.getName() + "?\n");
			System.out.println("1. Feed " + pet.getName());
			System.out.println("2. Play with " + pet.getName());
			System.out.println("3. Put " + pet.getName() + " to bed");
			System.out.println("4. Do nothing");
			System.out.println("5. Quit");
			choice = input.nextLine();

			/* Input Results */

			// Invalid Option

			while (!(choice.equalsIgnoreCase("1")) && !(choice.equalsIgnoreCase("2")) && !(choice.equalsIgnoreCase("3"))
					&& !(choice.equalsIgnoreCase("4")) && !(choice.equalsIgnoreCase("5"))) {
				System.out.println("\n" + pet.getName() + " seems to be confused.");
				System.out.println("Please enter a valid option.");
				choice = input.nextLine();
			}

			// Feed
			if (choice.equalsIgnoreCase("1")) {			
				pet.tick();
				pet.inputFeed();
				System.out.println("\n" + pet.getName() + " happily munches on virtual food. ");
				System.out.println("You don't quite understand how, but it fills him up.\n");
			
			// Play
			} else if (choice.equalsIgnoreCase("2")) {	
				pet.tick();
				pet.inputPlay();
				System.out.println("\n" + pet.getName() + " chases his own tail as you mysteriously");
				System.out.println("find yourself pulling out a laser pointer and moving");
				System.out.println("it in circles, out of your own accord.\n");
			
			// Put to bed
			} else if (choice.equalsIgnoreCase("3")) {	
				pet.tick();
				pet.inputSleep();
				System.out.println(pet.getName() + " curls up in his mysteriously obtained bed");
				System.out.println("and goes to sleep. It wakes up later, feeling refreshed.\n ");

			// Do nothing
			} else if (choice.equalsIgnoreCase("4")) {	
				pet.tick();
				System.out.println(pet.getName() + " sits and looks away, seemingly daydreaming about");
				System.out.println("eating, playing, and sleeping. \n");
			
			// Quit
			} else if (choice.equalsIgnoreCase("5")) {
				System.out.println(pet.getName() + " wags his tail in farewell, awaiting your return.");
				input.close();
				System.exit(0);
			}

		}
	}

}
