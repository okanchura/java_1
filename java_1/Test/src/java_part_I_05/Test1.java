package java_part_I_05;

// Tasks 1, 3 , 5, 6
/*
 * 1. Дано целое число. Если оно является положительным, то прибавить к нему 1; 
 * в противном случае не изменять его. Вывести полученное число.
 */

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("java_part_I_05 Задание 1:");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число");
		int n = in.nextInt();
		
		if (n > 0) {
			n = n+1;
		}
		
System.out.println(n);

	}

}
