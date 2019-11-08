package by.htp.les01.main;

public class Main28 {

	public static void main(String[] args) {
		// 28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.
		double рад =  1;
		double grad = рад * 180 / Math.PI ;
		
		int g = ( int ) grad;
		double min = (grad - g) *  60;
		
		int m = ( int ) min;
		double sec = (min - m) *  60;
		
		int s = ( int ) sec;
			System.out.println(g + " градусов " + m + " минут "  + s + " секунд ");
	}
}
