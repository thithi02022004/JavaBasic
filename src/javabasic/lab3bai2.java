package javabasic;

import java.util.Scanner;

public class lab3bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so: ");
		int x = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf(" %d x %d = %d ", x, i, x * i);
			System.out.println("\n");
		}
		scanner.close();
	}
}
