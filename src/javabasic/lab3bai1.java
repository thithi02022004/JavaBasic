package javabasic;

import java.util.Scanner;

public class lab3bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so bat ky: ");
		int x = scanner.nextInt();
		int count = 0;
		for (int i = 2; i <= x - 1; i++) {
			if (x % i == 0) {
				System.out.println("uoc so khac : " + i);
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.printf("%d la so nguyen to", x);
		} else {
			System.out.printf("%d KHONG PHAI so nguyen to", x);
		}
		scanner.close();
	}
}
