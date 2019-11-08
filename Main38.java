package by.htp.les01.main;

public class Main38 {

	public static void main(String[] args) {
		// 38. Для данных областей составить линейную программу, которая печатает true, если точка
		//     с координатами (х, у) принадлежит закрашенной области, и false — в противном случае: 
		
	    //	a). треугольник
		
		int x = 2;
		int y = 2;
		
		if (x >= 0 & x <= 4 & y >= 0 & y <= 4 - x) {
			System.out.println("a). true");
		} else if (x <= 0 & x >= -4 & y >= 0 & y <= 4 + x) {
			System.out.println("a). true");
		} else {
			System.out.println("a). false");
		}
		
		//б). прямоугольники
		
		if (x >= -2 && x <= 2 && y >= 0 && y <= 4) {
			System.out.println("б). true");
		} else if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
			System.out.println("б). true");
		} else {
			System.out.println("б). false");
		}
		
		//в). сектора
		
		if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 4 && x >= 0 && y >= 0 ) {
			System.out.println("в). true");
		} else if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 5 && x >= 0 && y <= 0) {
			System.out.println("в). true");
		} else {
			System.out.println("в). false");
		}
				
	}
}
