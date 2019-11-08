package by.htp.les01.main;

public class Main23 {

	public static void main(String[] args) {
		// 23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).
		double radiusr = 30.8;
		double radiusR = 40.2;
		double s = (Math.PI * Math.pow(radiusR, 2) - Math.PI * Math.pow(radiusr, 2));
			System.out.println("Площадь кольца: " + s);
	}
}
