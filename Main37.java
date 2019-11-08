package by.htp.les01.main;

public class Main37 {

	public static void main(String[] args) {
		//  37. Составить линейную программу, печатающую значение true, если указанное
		//      высказывание является истинным, и false — в противном случае:
		
	    //  37.1.  Целое число N является четным двузначным числом.
		
		int varN = 67;
		if (varN >= 10 && varN <= 99 && varN % 2 == 0) {
			System.out.println("Ответ 37.1: true");
		} else {
			System.out.println("Ответ 37.1: false");
		}
		
		//  37.2 Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
		//       последних цифр.
		
		int variableN = 5573;
		if ( (variableN % 10 + variableN % 100 / 10) == (variableN % 1000 / 100 + variableN % 10000 / 1000) ) {
			System.out.println("Ответ 37.2: true");
		} else {
			System.out.println("Ответ 37.2: false");
		}
		//  37.3 Сумма цифр данного трехзначного числа N является четным числом.
		
	    long var2N = 748;
		if ( (var2N % 10 + var2N % 100 / 10 + var2N % 1000 / 100) % 2 == 0 ) {
			System.out.println("Ответ 37.3: true");
		} else {
			System.out.println("Ответ 37.3: false");
		}
		
	    //  37.4 Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми
		//	     х = m, х = n (m < n).
		
		byte m = 9;
		byte n = 12;
		byte x = 7; 
		if (x >= m && x <= n) {
			System.out.println("Ответ 37.4: true");
		} else {
			System.out.println("Ответ 37.4: false");
		}
		
		//	37.5 Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
		
		long numberN = 864;
		if ( Math.pow(numberN, 2) == Math.pow((numberN % 10 + numberN % 100 / 10 + numberN % 1000 / 100), 3) ) {
			System.out.println("Ответ 37.5: true");
		} else {
			System.out.println("Ответ 37.5: false");
		}
		
		//	37.6 Треугольник со сторонами а,b,с является равнобедренным.
		
		byte a = 76; 
		byte b = 18;
		byte c = 18;
		if ( a == b || a == c || b == c ) {
			System.out.println("Ответ 37.6: true");
		} else {
			System.out.println("Ответ 37.6: false");
		}
		
		//	37.7  Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна
		//	  третьей цифре.
		
		int N = 459;
		int a1 = N % 10;
		int b1 = N % 100 / 10;
		int c1 = N % 1000 / 100;
		if ( (a1 + b1) == c1 || (a1 + c1) == b1 || (b1 + c1) == a1 ) {
			System.out.println("ответ 37.7: true");
		} else {
			System.out.println("Ответ 37.7: false");
		}
		
		//	37.8  Заданное число N является степенью числа а (показатель степени может находиться
		//	      в диапазоне от 0 до 4).
		
		N = 25;
		short a2 = 5;
		if (Math.pow(a2, 0) == N || Math.pow(a2, 1) == N || Math.pow(a2, 2) == N || Math.pow(a2, 3) == N || Math.pow(a2, 4) == N ) {
			System.out.println("Ответ 37.8: true");
		} else {
			System.out.println("Ответ 37.8: false");
		}
		
		//	37.9  График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).
		
		 m = 1;
		 n = 2;
		if ( a  * m * m + b * m + c == n ) {
			System.out.println("Ответ 37.9: true");
		} else {
			System.out.println("Ответ 37.9: false");
		}
	}
}
