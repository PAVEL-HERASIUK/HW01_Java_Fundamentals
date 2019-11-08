package by.htp.les01.main;

public class Main25 {

	public static void main(String[] args) {
		// 25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами
		//a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).
		double a =  5 ;
		double b =  11 ;
		double c =  6 ;
		double d  = b * b -  4  * a * c;
		double x1 = (- b + Math.sqrt ( d )) / ( 2 * a);
		double x2 = (- b - Math.sqrt ( d )) / 2 / a;
			System.out.println(" x1 = " + x1 + "; x2 = " + x2);
	}
}
