package java_part_I_05;

// Tasks 1, 3 , 5, 6
/*
 * 4. Даны три целых числа. Найти количество положительных и количество отрицательных чисел в исходном наборе.
 * 
 * Home Tasks 1-8 (p 5-6)
 */

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		System.out.println("java_part_I_05 Задание 4:");

		int neg = 0;
		int pos = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите целое число A");
		int a = in.nextInt();
		System.out.println("Введите целое число B");
		int b = in.nextInt();
		System.out.println("Введите целое число C");
		int c = in.nextInt();

			if (a < 0) {
			neg ++; 
			} else { pos ++; }
			if (b < 0) {
				neg ++; 
			} else { pos ++; }
			if (c < 0) {
				neg ++; 
			} else { pos ++; }
			
			System.out.print("Количество положительных чисел " + pos);
			System.out.println("  Количество отрицательных чисел " + neg);
			
		}
	}