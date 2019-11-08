package by.htp.les01.main;

public class Main29 {

	public static void main(String[] args) {
		// 29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с
		double a = 15;
		double b = 18;
		double c = 22;
		double alpha = Math.acos((b * b + c * c - a * a)/(2 * b * c));
		double beta = Math.acos((a * a + c * c - b * b)/(2 * a * c));
		double gamma = Math.acos((a * a + b * b - c * c)/(2 * a * b));
		double degreeAlpha = alpha * 180 / Math.PI;
		double degreeBeta = beta * 180 / Math.PI;
		double degreeGamma = gamma * 180 / Math.PI;
			System.out.println("Углы треугольника в радианах: "+ alpha+", "+ beta +", "+ gamma);
			System.out.println("Углы треугольника в градусах: "+ degreeAlpha +", "+ degreeBeta +", "+ degreeGamma);
	}
}
