package javabasic;

import java.util.Scanner;

public class lab2bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("so 1: ");
		int a = scanner.nextInt();
		System.out.println("so 2: ");
		int b = scanner.nextInt();
		System.out.println("so 3: ");
		int c = scanner.nextInt();
		if (a == 0) {
			System.out.println("phuong trinh vo nghiem");
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("phuong trinh vo nghiem");
			} else if (delta == 0) {
				double x = -b / (a * 2);
				System.out.println("Nghiem kep: " + x);
			} else if (delta > 0) {

				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("co 2 nghiem rieng biet: " + x1 + " va " + x2);
			}
		}
		scanner.close();
	}
}
