package java_part_I_07;

/* 2. Дано целое число N (> 0). Найти произведение N! = 1·2·…·N (N–факториал). 
 * Чтобы избежать целочисленного переполнения, вычислять это п с помощью вещественной переменной и вывести его как вещественное число.
*/
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите целое число N (> 0)");
		int N = in.nextInt();
		double s = 1;

		for (int i = 1; i <= N; i++) {
			s = s*i;
			}
		System.out.println("N–факториал = " + s);
	}
}
