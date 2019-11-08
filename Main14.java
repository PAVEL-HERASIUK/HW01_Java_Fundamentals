package by.htp.les01.main;

public class Main14 {
	public static void main (String[] args) {
	//14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
		double r = 10;
		double areaCircle = Math.PI * Math.pow (r, 2 );
		double circumference =2 * Math.PI * r;
			System.out.println("areaCircle = " + areaCircle);
			System.out.println("circumference = " + circumference);
    }
}	
