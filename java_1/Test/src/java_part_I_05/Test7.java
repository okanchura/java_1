package java_part_I_05;

// Tasks 1, 3 , 5, 6
/*
 * 7. ���� ����� �����, ������� � ��������� 1�999. 
 * ������� ��� ������ �������� ���� ������� ���������� �����, ��������� ����������� ����� � �. �.
 * 
 * Home Tasks 1-8 (p 5-6)
 */

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		System.out.println("java_part_I_05 ������� 7:");

		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� �����");
		int n = in.nextInt();
		String A = " A ";
		String B = " B ";
		int a = n % 2;

		if (a > 0) {
			if (n > 100 && n > 99) {
				A = "�������� ";
				B = "�����������";
			}

			if (n < 100 && n > 9) {
				A = "�������� ";
				B = "����������";
			}

			if (n < 10 && n > 0) {
				A = "�������� ";
				B = "�����������";
			}
			;

		} else {
			if (n < 0 && n > 99) {
				A = "������ ";
				B = "�����������";
			}

			if (n < 100 && n > 9) {
				A = "������ ";
				B = "����������";
			}

			if (n < 10 && n > 0) {
				A = "������ ";
				B = "�����������";
			}
		}

		System.out.println("��� " + A + " " + B + " �����");
	}
}