package java_part_I_06;

//Tasks 1, 3 , 4, 6
/*Даны два целых числа A и B (A < B). Вывести в порядке возрастания все целые числа,
расположенные между A и B (включая сами числа A и B), а также количество N этих чисел.*/
//Home Tasks all that left

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Введите 1е число");
		int a = in.nextInt();
		System.out.println("Введите 2е число");
		int b = in.nextInt();
		int count = 0; 
		
		do {
		System.out.println(a);
		a++; count++;}
		while (a <= b);
		
		System.out.println("Всего чисел " + count); in.close();
	}
		
}
