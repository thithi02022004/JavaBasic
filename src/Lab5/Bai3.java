package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Sanpham {
	public String name;
	public int price;

	public Sanpham(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Sanpham> listName = new ArrayList<Sanpham>();
		while (true) {
			System.out.println("Nhap ten: ");
			String name = scanner.nextLine();
			System.out.println("Nhap gia: ");
			int price = scanner.nextInt();
			Sanpham sp = new Sanpham(name, price);
			listName.add(sp);
			scanner.nextLine();
			System.out.println("Tiep Tuc khong? ");
			String choose = scanner.nextLine();
			if (choose.equals("N")) {
				break;
			}
		}
		for (Sanpham sanpham : listName) {
			System.out.println("Danh sach name: " + sanpham.name);
			System.out.println("Danh sach price: " + sanpham.price);
		}
		System.out.println("==================================");
		Collections.sort(listName, Comparator.comparing(sanpham -> sanpham.price));
//		Collections.reverse(listName);
		for (Sanpham sanpham : listName) {
			System.out.println("Danh sach name: " + sanpham.name);
			System.out.println("Danh sach price: " + sanpham.price);
		}
		System.out.println("===================================");
		System.out.println("Nhap ten can xoa");
		String nameRemove = scanner.nextLine();
//		int index = listName.indexOf(nameRemove);
//		listName.remove();
		for (Sanpham sp : listName) {
			if (sp.name.equals(nameRemove)) {
				listName.remove(sp);
				break;
			}
		}
		System.out.println("San pham sau khi XOA");
		for (Sanpham sanpham : listName) {
			System.out.println("Danh sach name: " + sanpham.name);
			System.out.println("Danh sach price: " + sanpham.price);
		}
		System.out.println("======================================");
		double sum = 0;
		for (Sanpham sp : listName) {
			sum += sp.price;
		}
		System.out.println("Gia trung binh: " + sum / listName.size());
	}
}
