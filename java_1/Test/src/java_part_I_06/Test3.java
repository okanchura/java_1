package java_part_I_06;

//Tasks 1, 3 , 4, 6
/* 3) ƒаны положительные числа A и B (A > B). Ќа отрезке длины A размещено максимально
возможное количество отрезков длины B (без наложений). Ќе использу€ операции умножени€ и
делени€, найти длину незан€той части отрезка A и количество отрезков B, размещенных на
отрезке A.
*/
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите число A");
		int a = in.nextInt();
		System.out.println("¬ведите число B");
		int b = in.nextInt();
		int d = a;
		int count = 0; 
		
		while (d > b) {
			d = d-b; count++;
			
			}
		
		System.out.println("ƒлина незан€той части отрезка A = " + d);
		System.out.println(" оличество отрезков B, размещенных на отрезке A = " + count);

	}
		
}
