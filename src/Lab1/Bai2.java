package Lab1;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài: ");
		int length = scanner.nextInt();
		System.out.println("Nhập chiều rộng: ");
		int width = scanner.nextInt();
		int chuvi = (length + width) * 2;
		int dientich = length * width;
		int min = Math.min(length, width);
		System.out.println("=======================");
		System.out.println("Chu vi: " + chuvi);
		System.out.println("Diện tích: " + dientich);
		System.out.println("Cạnh nhỏ nhất: " + min);
		scanner.close();
	}
}
