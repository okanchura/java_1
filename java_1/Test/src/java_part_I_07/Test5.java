package java_part_I_07;

/* 5. Даны положительные числа A, B, C. На прямоугольнике размера A×B размещено максимально возможное 
 * количество квадратов со стороной C (без наложений). 
 * Найти количество квадратов, размещенных на прямоугольнике. 
 * Операции умножения и деления не использовать.
*/
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите число A");
		int a = in.nextInt();
		System.out.println("Введите число B");
		int b = in.nextInt();
		System.out.println("Введите число C");
		int c = in.nextInt();
		int i = 0;
		int count = 0;

		if (a >= c) {
			for (; a >= c; i++) {
				a = a - c;
				count++;

				if (b >= c) {
				for (int j = 0; j <= i + 1; j++) {
					b = b - c;
				count++;}}
				
					else {if (a < c || b < c) {
				count = 0;
			}
			
		} 
	}} System.out.println("Количество квадратов " + count);
	in.close();
		}}
