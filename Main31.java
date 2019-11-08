package by.htp.les01.main;

public class Main31 {

	public static void main(String[] args) {
		// 31. Составить программу для вычисления пути, пройденного лодкой, если ее скорость в
		//стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против
		//течения реки — t2 ч
		int v = 19;
		int v1 = 8;
		int t1 = 1;
		int t2 = 2;
		int s = v * t1 + (v - v1) * t2;
			System.out.println (s + " км ");
	}
}
