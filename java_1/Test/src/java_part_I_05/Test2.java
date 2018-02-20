package java_part_I_05;

// Tasks 1, 3 , 5, 6
/*
 * 2. ƒано целое число. ≈сли оно €вл€етс€ положительным, то прибавить к нему 1; 
 * если отрицательным, то вычесть из него 2; если нулевым, то заменить его на 10. ¬ывести полученное число.
 * 
 * Home Tasks 1-8 (p 5-6)
 */

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println("java_part_I_05 «адание 2:");
		
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите число");
		int n = in.nextInt();
		
		if (n > 0) {
			n = n+1;
		} else
		if (n < 0) {
			n = n-2;
		} else {
			n = 10;
		}
System.out.println(n);

	}

}
