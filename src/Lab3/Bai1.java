package Lab3;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số: ");
		int a = scanner.nextInt();
		int n = 0;
		for (int i = 2; i < a - 1; i++) {
			if (a % i == 0) {
				n++;
				break;
			}
			i++;
		}
		if (n == 0) {
			System.out.printf("%d là số nguyên tố ", a);
		} else {
			System.out.printf("%d không phải số nguyên tố ", a);
		}

		scanner.close();
	}
}
