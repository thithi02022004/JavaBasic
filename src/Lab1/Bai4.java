package Lab1;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập b: ");
		int b = scanner.nextInt();
		System.out.println("Nhập c: ");
		int c = scanner.nextInt();
		double delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println("Detal: " + delta);
		if (delta < 0) {
			System.out.println("Detal âm khôn thể tính căn của nó");
		} else {
			System.out.println("Căn detal: " + Math.sqrt(delta));
		}

		scanner.close();
	}
}
