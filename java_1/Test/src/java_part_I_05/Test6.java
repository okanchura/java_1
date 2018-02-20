package java_part_I_05;

// Tasks 1, 3 , 5, 6
/*
 * 6. ƒан номер года (положительное целое число). ќпределить количество дней в этом году, 
 * учитыва€, что обычный год насчитывает 365 дней, а високосный Ч 366 дней. 
 * ¬исокосным считаетс€ год, дел€щийс€ на 4, за исключением тех годов, которые дел€тс€ на 100 и не дел€тс€ на 400 
 * (например, годы 300, 1300 и 1900 не €вл€ютс€ високосными, а 1200 и 2000 Ч €вл€ютс€).
 */
// Home Tasks 1-8 (p 5-6)

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		System.out.println("java_part_I_05 «адание 6:");
		
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите год");
		int Y = in.nextInt();
		int R;
				
		if (Y%4 != 0 || (Y%100 ==0 && Y%400 !=0)) {
			R = 365;
				} else {
			R = 366;
				}	
		
		System.out.println("¬ этом году " + R + " дней");
	}
}
