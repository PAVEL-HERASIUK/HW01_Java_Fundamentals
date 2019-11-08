package by.htp.les01.main;

public class Main10 {
	// 10. Вычислить значение выражения по формуле (все переменные принимают
	// действительные значения):

	public static void main(String[] args) {
		double x = 20;
		double y = 10;
		double q = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y)) * Math.tan(x * y);
		System.out.println(q);
	}
}