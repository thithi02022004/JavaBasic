package javabasic;

import java.util.Scanner;

public class tinhThue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Thu nhap cua ban: ");
		int salary = scanner.nextInt();
		if (salary < 10000000) {
			System.out.println("khong dong thue");
		} else if (salary > 10000000 && salary < 15000000) {
			System.out.println("Dong thue 10%");
		} else if (salary > 15000000 && salary < 30000000) {
			System.out.println("Dong thue 20%");
		} else if (salary > 30000000) {
			System.out.println("Dong thue 50%");
		}
		scanner.close();
	}
}
