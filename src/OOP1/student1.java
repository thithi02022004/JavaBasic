package OOP1;

public class student1 {
	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		student1 test = new student1();
		int a = test.sum(9, 6);
		System.out.println("Tong la: " + a);
	}
}
