package java_part_I_05;

// Tasks 1, 3 , 5, 6
/*
 * 6. ��� ����� ���� (������������� ����� �����). ���������� ���������� ���� � ���� ����, 
 * ��������, ��� ������� ��� ����������� 365 ����, � ���������� � 366 ����. 
 * ���������� ��������� ���, ��������� �� 4, �� ����������� ��� �����, ������� ������� �� 100 � �� ������� �� 400 
 * (��������, ���� 300, 1300 � 1900 �� �������� �����������, � 1200 � 2000 � ��������).
 */
// Home Tasks 1-8 (p 5-6)

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		System.out.println("java_part_I_05 ������� 6:");
		
		Scanner in = new Scanner(System.in);
		System.out.println("������� ���");
		int Y = in.nextInt();
		int R;
				
		if (Y%4 != 0 || (Y%100 ==0 && Y%400 !=0)) {
			R = 365;
				} else {
			R = 366;
				}	
		
		System.out.println("� ���� ���� " + R + " ����");
	}
}
