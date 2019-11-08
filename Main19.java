package by.htp.les01.main;

public class Main19 {

	public static void main(String[] args) {
		// 19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его
		//высоту, радиусы вписанной и описанной окружностей.
		double i =  8;
		
		double s = Math.pow(i, 2) * Math.sqrt( 3 ) / 4;
		double h = i * Math.sqrt( 3 ) / 2;
		double r = i /( 2 * Math.sqrt( 3 ));
		double R = i /Math.sqrt(3);
		
			System.out.println("Площадь = " + s);
			System.out.println("Высота = " + h);
			System.out.println("Радиус вписанной окружности = " + r);
			System.out.println("Радиус описанной окружности = " + R);
	}

}
