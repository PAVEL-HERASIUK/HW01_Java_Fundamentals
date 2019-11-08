package by.htp.les01.main;

public class Main30 {

	public static void main(String[] args) {
		//30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление
		//соединения.
		double R1 = 15;
		double R2 = 20;
		double R3 = 25;
		double R = 1 / R1 + 1 / R2 + 1 / R3;
			System.out.println(" 1/R = " + R + " Ом");
	}
}
