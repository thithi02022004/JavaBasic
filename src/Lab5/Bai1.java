package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Double> arr = new ArrayList<Double>();

		while (true) {
			System.out.println("Nhap so: ");
			double n = scanner.nextInt();
			arr.add(n);
			scanner.nextLine();
			System.out.println("tiep khong? Y/N");
			String chon = scanner.nextLine();
			if (chon.equals("N")) {
				break;
			}
		}
		for (Double double1 : arr) {
			System.out.println("" + double1);
		}
		double tong = 0;
		for (double double1 : arr) {
			tong += double1;
		}
		System.out.println("Tong la: " + tong);
	}
}
