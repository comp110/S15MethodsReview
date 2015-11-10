package Objects;

public class Main {
	public static void main(String[] args){
		Person jeffrey = new Person("Jeffrey", "Young", 20, 2, 16);
		Person kris = new Person("Kris", "Jordan", 30, 8, 20);
		Person jay = new Person("Jay", "Aikat", 35, 7, 15);
		
		int today = 10;
		int month = 11; //today is November 10th
		
		System.out.println(jeffrey.getName() + " is a TA for " + kris.getName() + " and " + jay.getName());
		
		System.out.println("\nKris is " + (kris.getAge() - jeffrey.getAge()) + " years older than Jeffrey");
		
		boolean hasBirthday = jeffrey.todayIsBirthday(today, month);
		
		if (hasBirthday){
			System.out.println("\nToday is " + jeffrey.getName() + "'s birhtday. Happy birthday!!!");
			jeffrey.makeOlder();
			System.out.println("\n" + jeffrey.getName() + " is " + jeffrey.getAge() + "years old");
		}
		else {
			System.out.println("\nToday is not " + jeffrey.getName() + "'s birthday");
		}
	}
}
