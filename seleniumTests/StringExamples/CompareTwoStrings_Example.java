package StringExamples;

import java.util.Scanner;

public class CompareTwoStrings_Example {

	public static void main(String[] args){
		/**
		 * 1. 'compareTo' method of String class is used to test equality of two String class objects.
		 * 2. compareTo method is case sensitive i.e "java" and "Java" are two different strings if you use compareTo method. 
		 * 3. If you wish to compare strings but ignoring the case then use compareToIgnoreCase method.
		 */
		
		String s1,s2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first String ......");
		s1 = input.nextLine();
		
		System.out.println("Enter the Second String ......");
		s2 = input.nextLine();
		
		if(s1.compareToIgnoreCase(s2) > 0){
			System.out.println("String1 is greater that string2. So, it doesn't matches.");
		}else if(s1.compareToIgnoreCase(s2) < 0){
			System.out.println("String1 is less that string2. So, it doesn't matches.");
		}else{
			System.out.println("Both the string are equal after comparision.");
		}

	}
}
