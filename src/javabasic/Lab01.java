package javabasic;

import java.util.Scanner;

public class Lab01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("your name : ");
		String name = scanner.nextLine();
		System.out.println("Your mark: ");
		float mark = scanner.nextFloat();
		System.out.printf(name + " has mark: " + mark);
		scanner.close();
	}
}
