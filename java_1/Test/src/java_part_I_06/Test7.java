package java_part_I_06;

//Tasks 1, 3 , 4, 6
/* 7) Найти число Фибоначчи под номером N.
*/
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Введите порядковый номер числа Фибоначчи - N");
		int n = in.nextInt();

		int a = 1;
		int b = 1; 
		int count = 0;
		int c = 0;
		
		while (n > count) {
			if (n > 0 && n < 2) {
				c = a; break;
//			System.out.println("Число Фибоначчи под номером N = " + c);
			
			} else { 
				if (n < 1 && n < 3) {
					c = b; break;
//				System.out.println("Число Фибоначчи под номером N = " + c);
					

			}
				c = a + b; a = b; b = c;  count++;
		System.out.println("Число Фибоначчи под номером " + n + " равно " + c);			
	}
}
}}