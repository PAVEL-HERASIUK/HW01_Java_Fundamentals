package by.htp.les01.main;

public class Main22 {

	public static void main(String[] args) {
		// 22. Дано натуральное число Т, которое представляет длительность прошедшего времени в
		//секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей
		// форме: ННч ММмин SSc
		int countSec = 15678;
		int hours = countSec / 3600;
		int mins = (countSec - hours * 3600) / 60;
		int sec = countSec - hours * 3600 - mins * 60;
			System.out.println(countSec + " сек. => " + hours + " ч. " + mins + " мин. " + sec + " сек.");
	}
}