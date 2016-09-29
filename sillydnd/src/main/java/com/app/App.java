package com.app;

import java.util.Scanner;

import com.parents.*;
import com.ourchars.*;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//testing human wizard stats
		HumanWizard ourHumanWizard = new HumanWizard();
		ourHumanWizard = ourHumanWizard.makeHumanWizard();
		System.out.println(ourHumanWizard.getWeapon());
		System.out.println(ourHumanWizard.getHealth());
		System.out.println(ourHumanWizard.getMagic());
		System.out.println(ourHumanWizard.getName());
		//testing human wizard test end
		
		
		
		boolean userInputCorrect = false;

		do {
			System.out.println("Welcome Epic D&D!\n" + "Choose Your Hero:\n" + "1. Human Wizard\n" + "2. Elf Royal\n"
					+ "3. Twi'lek Jedi\n" + "4. Smurf Warrior\n" + "5. Turle Ninja");
			String userInput = sc.nextLine();

			switch (userInput) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			default:
				userInputCorrect = true;
				System.out.println("You've entered an invalid choice.\n" + "1, 2, 3, 4, 5 are your choices.\n");
				break;
			}
		} while (userInputCorrect);

	}

}
