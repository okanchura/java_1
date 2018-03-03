package java_part_I_06;

//Tasks 1, 3 , 4, 6
/*6.  Дано целое число N (> 0). Используя операции деления нацело и взятия остатка от деления, 
 * найти число, полученное при прочтении числа N справа налево.
*/
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите целое число N (> 0)");
		int n = in.nextInt();

		System.out.println("Новое число " + n % 10 + "" + n / 10 % 10 + "" + n / 100);
		in.close();

	}

}
