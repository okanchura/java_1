package java_part_I_05;

// Tasks 1, 3 , 5, 6
/*
 * 2. ���� ����� �����. ���� ��� �������� �������������, �� ��������� � ���� 1; 
 * ���� �������������, �� ������� �� ���� 2; ���� �������, �� �������� ��� �� 10. ������� ���������� �����.
 * 
 * Home Tasks 1-8 (p 5-6)
 */

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println("java_part_I_05 ������� 2:");
		
		Scanner in = new Scanner(System.in);
		System.out.println("������� �����");
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
