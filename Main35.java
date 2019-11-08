package by.htp.les01.main;

public class Main35 {
	public static void main(String[] args) {
		// 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и
		// младшую
		// цифру целой части числа M/N.
		int m = 14;
		int n = 4;
		int res = (int) Math.floor(m / n);
		int res2 = (int) Math.floor((m / n - res) * 10);
		System.out.println(res % 10 + "." + res2);
	}
}
