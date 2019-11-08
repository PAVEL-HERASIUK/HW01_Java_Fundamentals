package by.htp.les01.main;

public class Main24 {

	public static void main(String[] args) {
		// 24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем
		//основании а.
		int a = 10;
		int b = 5;
		double alfa = 60;
		double radians = Math.toRadians(alfa);
		double h = ((a -b )/ 2) * Math.tan(radians);
			System.out.println("Площадь трапеции равна: " + h * (a + b) / 2);
	}
}
