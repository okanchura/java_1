package java_part_I_05;

// Tasks 1, 3 , 5, 6
/*
 * 5°. Даны три числа. Найти наименьшее из них.
 */

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		System.out.println("java_part_I_05 Задание 5:");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Введите 1е число");
		int n1 = in.nextInt();
		System.out.println("Введите 2е число");
		int n2 = in.nextInt();
		System.out.println("Введите 3е число");
		int n3 = in.nextInt();
		
		int min = 0;
		
		if (n1 < n2 && n1 < n3) {
			min = n1;
				} 
		if (n2 < n1 && n2 < n3) {
			min = n2;
				} 
		if (n3 < n1 && n3 < n2) {
			min = n3;
				}
		System.out.println(min);
	}
	
}
