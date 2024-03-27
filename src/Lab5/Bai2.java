package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> listName = new ArrayList<String>();
		while (true) {
			System.out.println("Nhập tên: ");
			String name = scanner.nextLine();
			listName.add(name);

			System.out.println("Tiep tuc khong? Y/N");
			String choose = scanner.nextLine();
			if (choose.equals("N")) {
				break;
			}
		}
		for (String name : listName) {
			System.out.println("Ten: " + name);
		}
		for (String name : listName) {
			Collections.shuffle(listName);
			System.out.println("Random: " + name);
		}
		Collections.sort(listName);
		Collections.reverse(listName);
		for (String name : listName) {
			System.out.println("Tang dan: " + name);
		}
		System.out.println("Nhap ten can xoa: ");
		String nameRemove = scanner.nextLine();
		for (int i = 0; i < listName.size(); i++) {
			if (listName.get(i).equals(nameRemove)) {
				listName.remove(i);
				break;
			}
		}
		System.out.println("Danh sach sau khi xoa: ");
		for (String name : listName) {
			System.out.println("" + name);
		}

	}
}
