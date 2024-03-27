package Lab1;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập cạnh: ");
		int canh = scanner.nextInt();
		double m3 = Math.pow(canh, 3);
		System.out.println("Thể tích là: " + m3);
		scanner.close();
	}
}
