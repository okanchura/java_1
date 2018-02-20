package java_part_I_07;

/* 3. Даны целые числа A и B (A < B). Вывести все целые числа от A до B включительно; при этом
число A должно выводиться 1 раз, число A + 1 должно выводиться 2 раза и т. д.
*/
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите целое число A (> 0)");
		int A = in.nextInt();
		System.out.println("Введите целое число B (> 0)");
		int B = in.nextInt();
		int N = 0;
		
		while (A<=B) {			

			N = N+1;
			
			for (int i = 0; i < N; i++) {
				
				System.out.print(A);
				}
			
			A = A+1; 
			System.out.println();
			}

		}
	
	}
