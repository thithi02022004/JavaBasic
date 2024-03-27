package Lab7;

public class Vuong extends ChuNhat {
	private double canh;

	public Vuong() {

	}

	public Vuong(double canh) {
		super();
		this.canh = canh;
	}

	public double getCanh() {
		return canh;
	}

	public void setCanh(double canh) {
		this.canh = canh;
	}

	public double dientichvuong() {
		return canh * 4;
	}

	@Override
	public void xuat() {
		System.out.println("Diện tích hình vuông là: " + dientichvuong());
	}
}
