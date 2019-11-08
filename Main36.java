package by.htp.les01.main;

public class Main36 {

	public static void main(String[] args) {
		// 36. Найти частное произведений четных и нечетных цифр четырехзначного числа
		int number = 1351;
		int odd = 1;
		int even = 1;
		int numbercopy = number;
		while (numbercopy > 0) {
			int ostat = numbercopy % 10;
			if (ostat % 2 == 0) {
				even = even * ostat;
			} else {
				odd = odd * ostat;
			}
			numbercopy = numbercopy / 10;
		}
			System.out.println("Частное произведений четных и нечетных цифр числа " + number + " равно " + ((double)even /odd));
	}
}
