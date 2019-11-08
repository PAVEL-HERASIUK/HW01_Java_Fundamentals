package by.htp.les01.main;

public class Main20 {

	public static void main(String[] args) {
		//20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
		double c = 50;
		double r = c/ 2 / Math.PI;
		double s = Math.PI * Math.pow( r, 2);
			System.out.println("Радиус окружности = " + r);
			System.out.println("Площадь круга = " + s);
	}
}
