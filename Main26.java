package by.htp.les01.main;

public class Main26 {

	public static void main(String[] args) {
		// 26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими
		//сторонами у.
		double a = 20;
		double b = 20;
		double alfa = 35;
		double radians = Math.toRadians(alfa);
			System.out.println("Площадь треугольника = " + (a * b * Math.sin(radians)) / 2);
	}
}
