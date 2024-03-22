package javabasic;

import java.util.Scanner;

public class lab2bai1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a : ");
		int a = scanner.nextInt();
		System.out.println("Nhap b : ");
		int b = scanner.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("phuong trinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("phuong trinh vo nghiem");
		} else {
			int x = -b / a;
			System.out.println("Nghiem = " + x);
		}
		scanner.close();

	}
}
