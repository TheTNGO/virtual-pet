package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome, and say \"Hi!\" to your new Virtual Pet!");
		System.out.println("Give your pet a name!");
		String nameInput = input.nextLine();
		VirtualPet pet = new VirtualPet(nameInput);

		System.out.println();
		System.out.println(pet.getName() + " wags its tail at you. It seems to like that name!\n");

		while (true) {

			int choice = 0;

			for (int i = 0; i < pet.getName().length(); i++) {
				System.out.print("*");
			}
			System.out.println("\n" + pet.getName() + "");
			for (int i = 0; i < pet.getName().length(); i++) {
				System.out.print("*");
			}

			System.out.println("\nNutrition: " + pet.getStatNutrition());
			System.out.println("Energy: " + pet.getStatEnergy());
			System.out.println("Mood: " + pet.getStatMood());

			System.out.println("\n" + pet.getName() + " looks at you in anticipation.");
			System.out.println("What would you like to do with " + pet.getName() + "?\n");
			System.out.println("1. Feed " + pet.getName());
			System.out.println("2. Play with " + pet.getName());
			System.out.println("3. Put " + pet.getName() + " to bed");
			System.out.println("4. Quit");
			choice = input.nextInt();
			input.nextLine();

			if (choice == 1) {
				pet.inputFeed();
				System.out.println("\n" + pet.getName() + " happily munches on virtual food. ");
				System.out.println("You don't quite understand how, but it fills him up.\n");
				pet.tick();
			} else if (choice == 2) {
				pet.inputPlay();
				System.out.println("\n" + pet.getName() + " chases his own tail as you mysteriously");
				System.out.println("find yourself pulling out a laser pointer and moving");
				System.out.println("it in circles, out of your own accord.\n");
				pet.tick();
			} else if (choice == 3) {
				pet.inputSleep();
				System.out.println("");
			}

		}
	}
}
