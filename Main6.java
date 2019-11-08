package by.htp.les01.main;

public class Main6 {
	// 6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько
	// литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем
	// в малом?

	public static void main(String[] args) {

		double m = 5;
		double n = 3;
		double z;
		double малыеN = 80 / n;
		double большиеM = n + 12;
		z = ((80 / n + 12) * m);
		System.out.println(z);
	}
}
