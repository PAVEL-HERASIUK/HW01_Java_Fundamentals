package by.htp.les01.main;

public class Main34 {

	public static void main(String[] args) {
		// 34. Дана величина А, выражающая объем информации в байтах. Перевести А в более
		//крупные единицы измерения информации.
		double b = 2_134_387_423;
		
		double kb = b / 1024;
		double mb = kb / 1024;
		double gb = mb / 1024;

			System.out.println (b  + " byte " );
			System.out.println (kb + " kb " );
			System.out.println (mb + " Mb " );
			System.out.println (gb + " Gb " );
	}
}
