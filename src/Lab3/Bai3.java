package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		System.out.println("Nhập số phần tử: ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Mảng đã sắp xếp: " + Arrays.toString(arr));

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
		System.out.println("Min là: " + min);
		int sum = 0, count = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] % 3 == 0) {
				sum += arr[i];
				count++;
			}
		}
		System.out.println("sum: " + sum);
		System.out.println("cout: " + count);
		System.out.println("Tổng là: " + sum / count);
		scanner.close();
	}
}
