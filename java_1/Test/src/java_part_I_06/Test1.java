package java_part_I_06;

//Tasks 1, 3 , 4, 6

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("������� 1� �����");
		int a = in.nextInt();
		System.out.println("������� 2� �����");
		int b = in.nextInt();
		int count = 0; 
		do {
		System.out.println(a);
		a++; count++;}
		while (a <= b);
		
		System.out.println(count);
	}
		
}
