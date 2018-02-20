package java_part_I_06;

//Tasks 1, 3 , 4, 6

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите 1е число");
		int a = in.nextInt();
		System.out.println("¬ведите 2е число");
		int b = in.nextInt();
		int d = 0;
		int count = 0; 
		
		while (a < b && d !=a) {
			System.out.println(d);
			b--;d = b-1; count++;
			}

		
	/*	do {
		System.out.println(b);
		b--; count++;}
		while (a < b);
	*/	
		System.out.println(count);
	}
		
}
