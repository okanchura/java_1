package java_part_I_07;

/* 2. ���� ����� ����� N (> 0). ����� ������������ N! = 1�2���N (N����������). 
 * ����� �������� �������������� ������������, ��������� ��� � � ������� ������������ ���������� � ������� ��� ��� ������������ �����.
*/
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� ����� N (> 0)");
		int N = in.nextInt();
		double s = 1;

		for (int i = 1; i <= N; i++) {
			s = s*i;
			}
		System.out.println("N���������� = " + s);
	}
}
