package Lab6;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fullName = scanner.nextLine();
		int spaceIndex = fullName.indexOf(' ');
		String lastName = fullName.substring(0, spaceIndex);
		int lastSpaceIndex = fullName.lastIndexOf(' ');
		String firstName = fullName.substring(lastSpaceIndex);
		String tempName = fullName.substring(spaceIndex, lastSpaceIndex);
		System.out.println("Họ: " + lastName);
		System.out.println("Tên Đệm: " + tempName);
		System.out.println("Tên: " + firstName);
	}
}
