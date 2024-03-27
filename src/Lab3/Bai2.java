package Lab3;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số: ");
		int a = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d", a, i, a * i);
			System.out.println("\n");
		}
		scanner.close();
	}
}
