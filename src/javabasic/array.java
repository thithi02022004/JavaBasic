package javabasic;

import java.util.Arrays;

public class array {
	public static void main(String[] args) {
		int[] clubs = { 5, 8, 6, 7, 4 };
		for (int i = 0; i < clubs.length - 1; i++) {
			for (int j = i + 1; j < clubs.length; j++) {
				if (clubs[i] < clubs[j]) {
					int temp = clubs[i];
					clubs[i] = clubs[j];
					clubs[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(clubs));
	}
}
