package Lab2;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập b: ");
		int b = scanner.nextInt();
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else {
				System.out.println("Phương trình vô nghiệm");
			}
		} else {
			int x = -b / a;
			System.out.println("Phương trình có nghiệm là: " + x);
		}
		scanner.close();
	}
}
