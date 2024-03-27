package Lab7;

public class ChuNhat {
	private double dai;
	private double rong;

	public ChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}

	public ChuNhat() {
	}

	public double getDai() {
		return dai;
	}

	public void setDai(double dai) {
		this.dai = dai;
	}

	public double getRong() {
		return rong;
	}

	public void setRong(double rong) {
		this.rong = rong;
	}

	public double chuvi() {
		double chuvi = (dai + rong) * 2;
		return chuvi;
	}

	public double dientich() {
		double dientich = dai * rong;
		return dientich;
	}

	public void xuat() {
		System.out
				.println("dai: " + dai + "-- rong:" + rong + "chu vi HCN:" + chuvi() + "--dien tich HCN:" + dientich());
	}
}
