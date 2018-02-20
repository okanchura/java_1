package java_part_I_05;

// Tasks 1, 3 , 5, 6
/*
 * 3. Даны три целых числа. Найти количество положительных чисел в исходном наборе.
 */
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("java_part_I_05 Задание 3:");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Введите 1е число");
		int n1 = in.nextInt();
		System.out.println("Введите 2е число");
		int n2 = in.nextInt();
		System.out.println("Введите 3е число");
		int n3 = in.nextInt();
		int count = 0;
		
		if (n1 > 0) {
			count = count + 1;
				} 
		if (n2 > 0) {
			count = count + 1;
				} 
		if (n3 > 0) {
			count = count + 1;
				}
		System.out.println(count);

	}

}
