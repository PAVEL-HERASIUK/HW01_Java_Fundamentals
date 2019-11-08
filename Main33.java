package by.htp.les01.main;

import java.util.Scanner;

public class Main33 {
	public static void main(String[] args) {
		// 33. Ввести любой символ и определить его порядковый номер, а также указать
		// предыдущий и последующий символы.

		Scanner sc = new Scanner(System.in);
		System.out.print(" Введите любой символ: ");
		char ch = sc.next().charAt(0);
		System.out.println("Код элемента \"" + ch + "\" равен " + (byte) ch);
		System.out.println("Предыдущий элемент: \"" + (char) ((byte) ch - 1) + "\" (" + ((byte) ch - 1)
				+ "), следующий элемент:" + " \"" + (char) ((byte) ch + 1) + "\" (" + ((byte) ch + 1) + ").");
	}
}