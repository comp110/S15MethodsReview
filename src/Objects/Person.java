package Objects;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private int birthMonth;
	private int birthDay;
	
	private static int population = 0;
	
	public Person(String firstName, String lastName, int age, int birthMonth, int birthDay){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		
		population += 1;
	}
	
	public String getName(){
		return this.firstName + " " + this.lastName;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public int getBirthDay(){
		return this.birthDay;
	}
	
	public int getBirthMonth(){
		return this.birthMonth;
	}
	
	public static int getPopulation(){
		return population;
	}
	
	public boolean todayIsBirthday(int currentMonth, int currentDay){
		if (currentMonth == this.birthMonth && currentDay == this.birthDay){
			return true;
		}
		return false;
	}
	
	public void makeOlder(){
		this.age += 1;
	}	
}
