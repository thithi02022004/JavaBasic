package javabasic;

import java.util.Scanner;

public class lab2bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		System.out.println("Lua chon cua ban: ");
		int value = scanner.nextInt();

		switch (value) {
		case 1: {
			System.out.println("Giai phuong trinh bac nhat");
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
			break;
		}
		case 2: {
			System.out.println("Giai phuong trinh bac hai");
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
			break;
		}
		case 3: {
			System.out.println("Tinh tien dien");
			System.out.println("nhap so dien: ");
			int sodien = scanner.nextInt();
			if (sodien >= 0 && sodien <= 100) {
				double tiendien = sodien * 1000;
				System.out.println("tien dien: " + tiendien);
			} else if (sodien >= 101) {
				double tiendien = sodien * 1500;
				System.out.println("Tien dien: " + tiendien);
			}
			break;
		}
		default:
			System.out.println("Ket thuc chuong trinh");
			System.exit(0);
		}
		scanner.close();
	}
}
