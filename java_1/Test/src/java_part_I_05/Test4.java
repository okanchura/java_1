package java_part_I_05;

// Tasks 1, 3 , 5, 6
/*
 * 4. ���� ��� ����� �����. ����� ���������� ������������� � ���������� ������������� ����� � �������� ������.
 * 
 * Home Tasks 1-8 (p 5-6)
 */

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		System.out.println("java_part_I_05 ������� 4:");

		int neg = 0;
		int pos = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� ����� A");
		int a = in.nextInt();
		System.out.println("������� ����� ����� B");
		int b = in.nextInt();
		System.out.println("������� ����� ����� C");
		int c = in.nextInt();

			if (a < 0) {
			neg ++; 
			} else { pos ++; }
			if (b < 0) {
				neg ++; 
			} else { pos ++; }
			if (c < 0) {
				neg ++; 
			} else { pos ++; }
			
			System.out.print("���������� ������������� ����� " + pos);
			System.out.println("  ���������� ������������� ����� " + neg);
			
		}
	}