package java_part_I_07;

/* 4. ���� ����� ����� N (> 1). ���� ��� �������� �������, �� ���� �� ����� �������������
���������, ����� 1 � ������ ����, �� ������� True, ����� ������� False.
*/
import java.util.Scanner;

public class Test4v1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� ����� N (> 0)");
		int n = in.nextInt();
		boolean A = false;
		int i = 0;

		if (n == 1) {
			A = false;
		}

		/*if (n == 2 || n == 3) {
			A = true;
		}
		/*
		 * ���� 2 � 3 ������� �����, �� �������� ��� ����� �������� �� �����������
		 * (���������� false). ��� �� ���?
		 */
		for (i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				A = false;
			} else
				A = true;
		}
		System.out.println("����� �������� �������? -" + A);

	} 
}