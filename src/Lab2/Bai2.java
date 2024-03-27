package Lab2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập b: ");
		int b = scanner.nextInt();
		System.out.println("Nhập c: ");
		int c = scanner.nextInt();
		if (a == 0) {
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
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				int x = -b / (2 * a);
				System.out.println("Nghiệm kép: " + x);
			} else if (delta > 0) {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Có 2 nghiệm phân biệt");
				System.out.println("x1: " + x1);
				System.out.println("x2: " + x2);
			}
		}
		scanner.close();
	}
}
