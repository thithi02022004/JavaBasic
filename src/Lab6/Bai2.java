package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
	public static class Sanpham {
		private String name;
		private double price;
		private String brand;

		public Sanpham(String name, double price, String brand) {
			this.name = name;
			this.price = price;
			this.brand = brand;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}
	}

	public static class QuanLySanPham {
		private ArrayList<Sanpham> arr = new ArrayList<>();

		public void nhap() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập số lượng sản phẩm: ");
			int n = scanner.nextInt();
			scanner.nextLine(); // Đọc bỏ dòng trống

			for (int i = 0; i < n; i++) {
				System.out.println("Nhập thông tin cho sản phẩm thứ " + (i + 1) + ":");
				System.out.println("Nhập tên sản phẩm: ");
				String name = scanner.nextLine();
				System.out.println("Nhập giá sản phẩm: ");
				double price = scanner.nextDouble();
				scanner.nextLine(); // Đọc bỏ dòng trống
				System.out.println("Nhập thương hiệu: ");
				String brand = scanner.nextLine();
				arr.add(new Sanpham(name, price, brand));
			}
			scanner.close();
		}

		public void xuat() {
			System.out.println("Danh sách sản phẩm: ");
			for (Sanpham sanpham : arr) {

				if (sanpham.getBrand().equals("nokia")) {
					System.out.println("Tên sản phẩm: " + sanpham.getName() + ", Giá: " + sanpham.getPrice()
							+ ", Thương hiệu: " + sanpham.getBrand());
				}

			}
		}
	}

	public static void main(String[] args) {
		QuanLySanPham quanLySanPham = new QuanLySanPham();
		quanLySanPham.nhap();
		quanLySanPham.xuat();
	}
}
