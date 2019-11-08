package by.htp.les01.main;

public class Main12 {

	public static void main(String[] args) {
		// 12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).
		int x1 = 2;
		int x2 = 5;
		int y1 = 3;
		int y2 = 7;
		int a = x2 - x1;
		int b = y2 - y1;

		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

		System.out.println(c);
	}
}
