package java_part_I_07;

/* 4. ���� ����� ����� N (> 1). ���� ��� �������� �������, �� ���� �� ����� �������������
���������, ����� 1 � ������ ����, �� ������� True, ����� ������� False.
*/
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� ����� N (> 0)");
		int n = in.nextInt();
		boolean A;
		int j = 3;
		//boolean C = (n <= 1) && (y1 < 9) && (x2 < 9) && (y2 < 9);		
		

		    if (n <= 1) {A = false;};
		    if (n == 2) {A = true;};
		    if (n%2==0) {A = false;};

		    for (j = 3; j * j <= n; j+=2)
		         if (n % j == 0) {A = false;};
		          {A = true;};
		
		/*for (int i = 1; i <= N; i++) {
			sum = sum + b*i; b = b*a;
			} */
		System.out.println("����� �������� �������? -" + A);
	}}
