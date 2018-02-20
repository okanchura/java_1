package java_part_I_06;

//Tasks 1, 3 , 4, 6
/* 6) ƒано целое число N (> 0). »спользу€ операции делени€ нацело и вз€ти€ остатка от делени€,
найти число, полученное при прочтении числа N справа налево.
*/
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите целое число N (> 0)");
		int n = in.nextInt();
		int d = 10;
		int p = 0;
		
		while (n% != 0) {
			p = n/d;
			System.out.println(p);
			d = d-b; count++;
			
			}
		
	//	System.out.println("ƒлина незан€той части отрезка A = " + d);
		//System.out.println(" оличество отрезков B, размещенных на отрезке A = " + count);

	}
		
}
