package by.htp.les01.main;

public class Main32 {

	public static void main(String[] args) {
		// 32.Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59).
		//Какое время будут показывать часы через р ч q мин r с?
		
		int hourNow = (int)(Math.random() * 24 - 1);
		int minNow = (int)(Math.random() * 60 - 1);
		int secundNow = (int)(Math.random() * 60 - 1);
		
		int hour = 3;
		int minute = 57;
		int secund = 39;
		
		int secundFut = (secundNow + secund) % 60;
		int minuteFut = (minNow + minute + (secundNow + secund)/60) % 60;
		int hourFut = (hourNow + hour + (minNow + minute + (secundNow + secund)/60)/60) % 24;
		
			System.out.println("Текущее время " + hourNow + " : " + minNow  + " : " + secundNow);
			System.out.println("Время через "+ hour + "ч " + minute +  "мин " + secund + "сек = " + hourFut + " : " + minuteFut + " : "+ secundFut);

	}
}
