package by.htp.les01.main;

public class Main16 {

	public static void main(String[] args) {
		// 16. Найти произведение цифр заданного четырехзначного числа.

		int n = 4567;
		int m = 1;
		for (int i = 0; i < 4; i++) {
			m *= n % 10;
			n /= 10;
		}
		System.out.println(" Произведение: " + m);
	}
}
