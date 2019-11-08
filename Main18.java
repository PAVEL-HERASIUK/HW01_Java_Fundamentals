package by.htp.les01.main;

public class Main18 {

	public static void main(String[] args) {
		//Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем
		//этого куба.
		
		int a = 2;
		int faceArea = a * a;
		int s = faceArea * 6;
		double volume  =  Math.pow (a, 3);

			System.out.println ("Площадь грани : " + faceArea);
			System.out.println ("Площадь полной поверхности: " + s);
			System.out.println ("Объем куба: " + volume);
	}
}
