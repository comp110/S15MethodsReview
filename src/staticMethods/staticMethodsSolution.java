package staticMethods;

import java.util.Scanner;

public class staticMethodsSolution {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		String input2 = keyboard.nextLine();
		
		String output = reverse(input);
		
		System.out.println(output);
		
		System.out.println(concatenate(input, input2));
		
	}
	
	public static String reverse(String str){
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--){
			reverseStr += str.charAt(i);
		}
		return reverseStr;
	}
	
	public static String concatenate(String str1, String str2){
		return str1 + str2;
	}
}
