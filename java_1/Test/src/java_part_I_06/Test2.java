package java_part_I_06;

//Tasks 1, 3 , 4, 6
/*2) Даны два целых числа A и B (A < B). Вывести в порядке убывания все целые числа,
расположенные между A и B (не включая числа A и B), а также количество N этих чисел.*/

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Введите 1е число");
		int a = in.nextInt();
		System.out.println("Введите 2е число");
		int b = in.nextInt();
		int d = 0;
		int count = 0; 
		
		do {
		System.out.println(b-1);
		b--; count++;}
		while (a+1 < b);
	
		System.out.println("Всего чисел " + count); in.close();
	}
		
}
