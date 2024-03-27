package Lab4;

import java.util.Scanner;

public class Sanpham {
	private String tensp;
	private double dongia;
	private double giamgia;

	public Sanpham() {

	}

	public Sanpham(String tensp, double dongia, double giamgia) {
		this.tensp = tensp;
		this.dongia = dongia;
		this.giamgia = giamgia;
	}

	public String getTensp() {
		return tensp;
	}

	public void setTensp(String tensp) {
		this.tensp = tensp;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	public double getGiamgia() {
		return giamgia;
	}

	public void setGiamgia(double giamgia) {
		this.giamgia = giamgia;
	}

	public double getThueNhapKhau() {
		return dongia * 0.1;
	}

	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên sản phẩm");
		String tensp = scanner.nextLine();
		setTensp(tensp);
		System.out.println("Nhập đơn giá: ");
		double dongia = scanner.nextDouble();
		setDongia(dongia);
		System.out.println("Nhập giảm giá: ");
		double giamgia = scanner.nextDouble();
		setGiamgia(giamgia);

	}

	public void xuat() {
		System.out.println("Tên san pham: " + getTensp());
		System.out.println("Gia san pham: " + dongia);
		System.out.println("Giam gia: " + giamgia);
		System.out.println("Thue nhap khau: " + getThueNhapKhau());
	}

}
