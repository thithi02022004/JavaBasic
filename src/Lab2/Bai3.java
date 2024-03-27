package Lab2;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số điện: ");
		int sodien = scanner.nextInt();
		if (sodien < 50) {
			int tien = sodien * 1000;
			System.out.println("Số tiền: " + tien);
		} else if (sodien > 50) {
			int tien = 50 * 1000 + (sodien - 50) * 1200;
			System.out.println("Số tiền: " + tien);
		}
		scanner.close();
	}
}
