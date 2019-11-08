package by.htp.les01.main;

public class Main39 {

	public static void main(String[] args) {
		// 39. Дано действительное число х. Не пользуясь никакими другими арифметическими
		//     операциями, кроме умножения, сложения и вычитания, вычислите за минимальное число
		//     операций:  2x4 - 3х3 + 4х2 - 5х + 6
		
		double x = Math.random();
		double y = 2 * Math.pow(x, 4) - 3 * Math.pow(x, 3) + 4 * Math.pow(x, 2) - 5 * x + 6;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
