package java_part_I_07;

/* 1. ���� ����� ����� N (> 0). ����� �������� ��������� 1 � 2 + 3 � �  (N ���������, ����� ����������). 
 * �������� �������� �� ������������
*/
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� ����� N (> 0)");
		int N = in.nextInt();
		int sum = 0;
		int a = -1;
		int b = 1;
		
		for (int i = 1; i <= N; i++) {
			sum = sum + b*i; b = b*a;
			}
		System.out.println("����� N = " + sum);
	}
}
