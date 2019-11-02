package by.htp.les01.main;

public class Main8 {
	// 8. Вычислить значение выражения по формуле (все переменные принимают
    //	действительные значения):(b + √b2 + 4ac2)/a − a3c+ b−2 
	
	public static void main (String[] args) {
	   	double a = 2.2;
	   	double b = 3.3;
	   	double c = 4.4;
	   	double d = (b + Math.sqrt(Math.pow(b,2)+ 4*a*c)) / 2*a - Math.pow(a,3)*c + Math.pow(b,-2);
	   	    System.out.println("Задача 8. Ответ:" + d);
	}	    
}
