package java_part_I_07;

/* 4. ƒано целое число N (> 1). ≈сли оно €вл€етс€ простым, то есть не имеет положительных
делителей, кроме 1 и самого себ€, то вывести True, иначе вывести False.
*/
import java.util.Scanner;

public class Test4v1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите целое число N (> 0)");
		int n = in.nextInt();
		boolean A = false;
		int i = 0;

		if (n == 1) {
			A = false;
		}

		/*if (n == 2 || n == 3) {
			A = true;
		}
		/*
		 * хот€ 2 и 3 простые числа, но алгоритм без такой оговорки не срабатывает
		 * (показывает false). „то не так?
		 */
		for (i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				A = false;
			} else
				A = true;
		}
		System.out.println("„исло €вл€етс€ простым? -" + A);

	} 
}