package test;

import java.util.Scanner;

public class ConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age:");
		age = scanner.nextInt();
		
		if (age < 17) {
			System.out.println("Not eligible");
		} else if (age == 17) {
			System.out.println("Eligible next year");
		} else {
			System.out.println("Eligible for Voting");
		}
		scanner.close();
	}

}
