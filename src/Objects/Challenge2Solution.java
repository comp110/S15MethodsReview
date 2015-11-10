package Objects;

import java.util.Scanner;

public class Challenge2Solution {
	public static void main(String[] args){
		Person jeffrey = new Person("Jeffrey", "Young", 20, 2, 16);
		Person kris = new Person("Kris", "Jordan", 30, 8, 20);
		Person jay = new Person("Jay", "Aikat", 35, 7, 15);
		
		System.out.println("The current population is: " + Person.getPopulation());
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String first = keyboard.nextLine();
		
		System.out.println("Enter your last name");
		String last = keyboard.nextLine();
		
		System.out.println("Enter your age");
		int currentAge = keyboard.nextInt();
		
		System.out.println("Enter your birth month");
		int month = keyboard.nextInt();
		
		System.out.println("Enter your birth day");
		int day = keyboard.nextInt();
		
		Person user = new Person(first, last, currentAge, month, day);
		
		System.out.println("Your name is: " + user.getName());
		
		System.out.println("The current population is: " + Person.getPopulation());

	}
	
	public static boolean hasOddBirthday(Person somebody){
		if ((somebody.getBirthDay() % 2 == 1) && (somebody.getBirthMonth() % 2 == 1)){
			return true;
		}
		return false;
	}
}
