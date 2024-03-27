package javabasic;

import java.util.Scanner;

public class lab2bai4 {
	public static void bai01() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 1 <<");
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

	public static void bai02() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 2 <<");
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

	public static void bai03() {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG 3 <<");
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so dien: ");
		int sodien = scanner.nextInt();
		if (sodien >= 0 && sodien <= 100) {
			double tiendien = sodien * 1000;
			System.out.println("tien dien: " + tiendien);
		} else if (sodien >= 101) {
			double tiendien = 100 * 1000 + (sodien - 100) * 1500;
			System.out.println("Tien dien: " + tiendien);
		}
		scanner.close();
	}

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
			bai01();
			break;
		}
		case 2: {
			bai02();
			break;
		}
		case 3: {
			bai03();
			break;
		}
		default:
			System.out.println("Ket thuc chuong trinh");
			System.exit(0);
		}
		scanner.close();
	}
}
