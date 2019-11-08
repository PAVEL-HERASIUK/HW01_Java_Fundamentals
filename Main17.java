package by.htp.les01.main;

public class Main17 {

	public static void main(String[] args) {
		//  Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
		//геометрическое модулей этих чисел.
		double a =  3 ;
		double b =  5 ;
		double srCubes = (Math.pow (a, 3) +  Math.pow (b, 3))/2;
		double gModules =  Math.sqrt ((a * b));
			System.out.println( srCubes );
			System.out.println( gModules );
	}

}
