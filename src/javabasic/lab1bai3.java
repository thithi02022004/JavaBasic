package javabasic;

import java.util.Scanner;

public class lab1bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap canh: ");
		int canh = scanner.nextInt();
		double thetich = Math.pow(canh, 3);
		System.out.println("the tich canh la: " + thetich);
		scanner.close();
	}
}
