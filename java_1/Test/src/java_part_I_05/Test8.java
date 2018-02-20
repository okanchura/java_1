package java_part_I_05;

// Tasks 1, 3 , 5, 6
/*
 * 8) ƒано целое число в диапазоне 1Ц7. ¬ывести строку Ч название дн€ недели, соответствующее данному числу
 *  (1 Ч Ђпонедельникї, 2 Ч Ђвторникї и т. д.).
 */

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		System.out.println("java_part_I_05 «адание 8:");
		
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите число");
		int n = in.nextInt();
		String day;
		
		switch (n) {
		case 1: day = "Monday"; break;
		case 2: day = "Tuesday"; break;
		case 3: day = "Wednesday"; break;
		case 4: day = "Thursday"; break;
		case 5: day = "Friday"; break;
		case 6: day = "Saturday"; break;
		case 7: day = "Sunday"; break;
		default: day = "Invalid day number";break;
		}
		
		System.out.println(day);
	}
	
}
