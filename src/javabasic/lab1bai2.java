package javabasic;

import java.util.Scanner;

public class lab1bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("length : ");
		int length = scanner.nextInt();
		System.out.println("width : ");
		int width = scanner.nextInt();
		int chuvi = (length + width) * 2;
		int dientich = length * width;
		int canh = Math.min(length, width);
		System.out.println("chu vi = " + chuvi);
		System.out.println("dien tich = " + dientich);
		System.out.println("canh nho nhat la: " + canh);
		scanner.close();
	}
}
