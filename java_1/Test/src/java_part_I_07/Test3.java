package java_part_I_07;

/* 3. ���� ����� ����� A � B (A < B). ������� ��� ����� ����� �� A �� B ������������; ��� ����
����� A ������ ���������� 1 ���, ����� A + 1 ������ ���������� 2 ���� � �. �.
*/
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� ����� A (> 0)");
		int A = in.nextInt();
		System.out.println("������� ����� ����� B (> 0)");
		int B = in.nextInt();
		int N = 0;
		
		while (A<=B) {			

			N = N+1;
			
			for (int i = 0; i < N; i++) {
				
				System.out.print(A);
				}
			
			A = A+1; 
			System.out.println();
			}

		}
	
	}
