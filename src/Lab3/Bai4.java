package Lab3;

import java.util.Scanner;

public class Bai4 {
	private static final int[] score = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng sinh viên: ");
		int n = scanner.nextInt();
		String name[] = new String[n];
		double score[] = new double[n];
		for (int i = 0; i < n; i++) {
			scanner.nextLine();
			System.out.println("Nhập tên sinh viên: ");
			name[i] = scanner.nextLine();
			System.out.println("Nhập Điểm: ");
			score[i] = scanner.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Họ và tên : " + name[i]);
			System.out.println("Điểm: " + score[i]);
			if (score[i] < 9) {
				System.out.println("Xuất Sắc");
			} else if (score[i] >= 8 && score[i] < 9) {
				System.out.println("Giỏi");

			} else if (score[i] < 8 && score[i] >= 6.5) {
				System.out.println("Khá");

			} else if (score[i] < 6.5 && score[i] > 5) {
				System.out.println("Trung bình");
			} else if (score[i] < 5) {
				System.out.println("Yếu");
			}

		}
		System.out.println("Sắp xếp theo danh sách điểm:");
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (score[i] < score[j]) {
					String tempName = name[i];
					name[i] = name[j];
					name[j] = tempName;
					Double tempScore = score[i];
					score[i] = score[j];
					score[j] = tempScore;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print("Họ và tên " + name[i] + " Điểm TB: " + score[i] + " Học Lực: ");
			if (score[i] >= 9) {
				System.out.println("Xuất Sắc");
			} else if (score[i] < 9 && score[i] >= 8) {
				System.out.println("Giỏi");
			} else if (score[i] < 8 && score[i] >= 6.5) {
				System.out.println("khá");
			} else if (score[i] < 6.5 && score[i] >= 5) {
				System.out.println("Trung Bình");
			} else {
				System.out.println("Yếu");
			}

		}
		scanner.close();
	}
}
