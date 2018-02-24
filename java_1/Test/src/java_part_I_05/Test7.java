package java_part_I_05;

// Tasks 1, 3 , 5, 6
/*
 * 7. Дано целое число, лежащее в диапазоне 1–999. 
 * Вывести его строку описание вида «четное двузначное число», «нечетное трехзначное число» и т. Д.
 * 
 * Home Tasks 1-8 (p 5-6)
 */

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		System.out.println("java_part_I_05 Задание 7:");

		Scanner in = new Scanner(System.in);
		System.out.println("Введите целое число");
		int n = in.nextInt();
		String A = " A ";
		String B = " B ";
		int a = n % 2;

		if (a > 0) {
			if (n > 100 && n > 99) {
				A = "нечетное ";
				B = "трехзначное";
			}

			if (n < 100 && n > 9) {
				A = "нечетное ";
				B = "двузначное";
			}

			if (n < 10 && n > 0) {
				A = "нечетное ";
				B = "однозначное";
			}
			;

		} else {
			if (n < 0 && n > 99) {
				A = "четное ";
				B = "трехзначное";
			}

			if (n < 100 && n > 9) {
				A = "четное ";
				B = "двузначное";
			}

			if (n < 10 && n > 0) {
				A = "четное ";
				B = "однозначное";
			}
		}

		System.out.println("Это " + A + " " + B + " число");
	}
}