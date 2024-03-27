package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
	public static class Student {
		private String fullName;
		private String email;
		private String phone;
		private String cccd;

		public Student(String fullName, String email, String phone, String cccd) {
			this.fullName = fullName;
			this.email = email;
			this.phone = phone;
			this.cccd = cccd;
		}

		public Student() {
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;

		}

		public String getCccd() {
			return cccd;
		}

		public void setCccd(String cccd) {
			this.cccd = cccd;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> listStudent = new ArrayList<>();
		System.out.println("Nhập số lượng sinh viên: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập Họ và tên: ");
			String fullName = scanner.nextLine();
			System.out.println("Nhập số điện thoại: ");
			String phone = scanner.nextLine();
			System.out.println("Nhập email: ");
			String email = scanner.nextLine();
			System.out.println("Nhập số căn cước: ");
			String cccd = scanner.nextLine();

			if (phone.matches("^0\\d{9,10}$")) {
				if (email.matches("^\\w+@\\w+(\\.\\w{2,3})+$")) {
					if (cccd.matches("[0-9]{9}")) {
						Student student = new Student(fullName, email, phone, cccd);
						listStudent.add(student);
						System.out.println("cccd không hợp lệ");
					}
				} else {
					System.out.println("email không hợp lệ");
				}

			} else {
				System.out.println("số điện thoại không hợp lệ");
			}

		}

		System.out.println("Danh sách sinh viên sau khi nhập:");
		for (Student student : listStudent) {
			System.out.println("Họ và tên: " + student.getFullName());
			System.out.println("Số điện thoại: " + student.getPhone());
			System.out.println("Email: " + student.getEmail());
			System.out.println("Số căn cước: " + student.getCccd());
		}
	}
}
