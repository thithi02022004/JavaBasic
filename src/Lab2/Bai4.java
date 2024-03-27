package Lab2;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("==================================");
		System.out.println("1. Giải phương trình bậc 1");
		System.out.println("2. Giải phương trình bậc 2");
		System.out.println("3. Tính tiền điện");
		System.out.println("4. Kết thúc");
		System.out.println("==================================");
		System.out.println("Chọn chức năng: ");
		int value = scanner.nextInt();
		switch (value) {
		case 1: {
			System.out.println("Nhập a: ");
			int a = scanner.nextInt();
			System.out.println("Nhập b: ");
			int b = scanner.nextInt();
			if (a == 0) {
				if (b == 0) {
					System.out.println("Phương trình vô số nghiệm");
				} else {
					System.out.println("Phương trình vô nghiệm");
				}
			} else {
				int x = -b / a;
				System.out.println("Phương trình có nghiệm là: " + x);
			}
			break;
		}
		case 2: {
			System.out.println("Nhập a: ");
			int a = scanner.nextInt();
			System.out.println("Nhập b: ");
			int b = scanner.nextInt();
			System.out.println("Nhập c: ");
			int c = scanner.nextInt();
			if (a == 0) {
				if (a == 0) {
					if (b == 0) {
						System.out.println("Phương trình vô số nghiệm");
					} else {
						System.out.println("Phương trình vô nghiệm");
					}
				} else {
					int x = -b / a;
					System.out.println("Phương trình có nghiệm là: " + x);
				}
			} else {
				double delta = Math.pow(b, 2) - 4 * a * c;
				if (delta < 0) {
					System.out.println("Phương trình vô nghiệm");
				} else if (delta == 0) {
					int x = -b / (2 * a);
					System.out.println("Nghiệm kép: " + x);
				} else if (delta > 0) {
					double x1 = (-b + Math.sqrt(delta)) / (2 * a);
					double x2 = (-b - Math.sqrt(delta)) / (2 * a);
					System.out.println("Có 2 nghiệm phân biệt");
					System.out.println("x1: " + x1);
					System.out.println("x2: " + x2);
				}
			}
			break;
		}
		case 3: {
			System.out.println("Nhập số điện: ");
			int sodien = scanner.nextInt();
			if (sodien < 50) {
				int tien = sodien * 1000;
				System.out.println("Số tiền: " + tien);
			} else if (sodien > 50) {
				int tien = 50 * 1000 + (sodien - 50) * 1200;
				System.out.println("Số tiền: " + tien);
			}
			break;
		}
		default:
			System.out.println("Thoat Chuong trinh");
			System.exit(0);
		}
	}
}
