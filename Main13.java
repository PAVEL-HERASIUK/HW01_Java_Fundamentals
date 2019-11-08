package by.htp.les01.main;

public class Main13 {

	public static void main(String[] args) {
		// 13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3).
		// Найти его периметр и площадь.
		
		double x1 = 8;
		double x2 = 2;
		double x3 = 3;
		double y1 = 4;
		double y2 = 5;
		double y3 = 6;
		double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		double c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double perimeter = a + b + c;
		double area = Math.sqrt(perimeter / 2 * (perimeter / 2 - a) * (perimeter / 2 - b) * (perimeter / 2 - c));
		System.out.println(" area = " + area + "; perimeter = " + perimeter);
	}
}
