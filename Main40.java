package by.htp.les01.main;

public class Main40 {

	public static void main(String[] args) {
		// 40. Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об
		//     экономии операций
		
		int x = 2;
		double y1;
		double y2;
		y1 = (-2) * x + 3 * Math.pow(x, 2) - 4 * Math.pow(x, 3);
		y2 = 1 + 2 * x + 3 * Math.pow(x, 2) + 4 * Math.pow(x, 3);
		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + y2);
	}
}
