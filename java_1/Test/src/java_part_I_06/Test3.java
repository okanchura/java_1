package java_part_I_06;

//Tasks 1, 3 , 4, 6
/* 3) ���� ������������� ����� A � B (A > B). �� ������� ����� A ��������� �����������
��������� ���������� �������� ����� B (��� ���������). �� ��������� �������� ��������� �
�������, ����� ����� ��������� ����� ������� A � ���������� �������� B, ����������� ��
������� A.
*/
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� A");
		int a = in.nextInt();
		System.out.println("������� ����� B");
		int b = in.nextInt();
		int d = a;
		int count = 0; 
		
		while (d > b) {
			d = d-b; count++;
			
			}
		
		System.out.println("����� ��������� ����� ������� A = " + d);
		System.out.println("���������� �������� B, ����������� �� ������� A = " + count);

	}
		
}
