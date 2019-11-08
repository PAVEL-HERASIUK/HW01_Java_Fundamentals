package by.htp.les01.main;

public class Main11 {

	public static void main(String[] args) {
		// 11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b
		// двух катетов.

		double a = 15;
		double b = 8;
		double hypotenuse;
		double perimeter;
		double area;
		hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		perimeter = a + b + hypotenuse;
		area = (a * b) / 2;
		System.out.println("perimeter: " + perimeter);
		System.out.println("area: " + area);
	}
}
