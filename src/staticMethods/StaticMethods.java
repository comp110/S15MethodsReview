package staticMethods;

import java.util.Scanner;

public class StaticMethods {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		
		String output = reverse(input);
		
		System.out.println(output);
		
	}
	
	public static String reverse(String str){
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--){
			reverseStr += str.charAt(i);
		}
		return reverseStr;
	}
	
	//implement your concatenate method below
}
