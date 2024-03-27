package javabasic;

import java.util.Arrays;
import java.util.Scanner;

public class lab3bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so luong pt mang: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Nhap phan tu");
		// For reading the element
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Array ban dau: " + Arrays.toString(a));
//		Arrays.sort(a);
//		System.out.println("Aray moi: " + Arrays.toString(a));
//		System.out.println("max = " + a[a.length - 1]);
//		System.out.println("min	= " + a[0]);
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = Math.max(max, a[i]);
			}
		}
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			min = Math.min(min, a[i]);
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
