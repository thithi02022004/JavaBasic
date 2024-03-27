package Lab1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập họ và tên: ");
		String fullName = scanner.nextLine();
		System.out.println("Nhập điểm trung bình: ");
		float gpa = scanner.nextFloat();
		System.out.println(fullName);
		System.out.println("Điểm TB: " + gpa);
		scanner.close();
	}
}
