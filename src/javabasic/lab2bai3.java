package javabasic;

import java.util.Scanner;

public class lab2bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so dien: ");
		int sodien = scanner.nextInt();
		if (sodien >= 0 && sodien <= 100) {
			double tiendien = sodien * 1000;
			System.out.println("tien dien: " + tiendien);
		} else if (sodien >= 101) {
			double tiendien = sodien * 1500;
			System.out.println("Tien dien: " + tiendien);
		}
		scanner.close();
	}
}
