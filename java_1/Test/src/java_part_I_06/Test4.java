package java_part_I_06;

//Tasks 1, 3 , 4, 6
/* 4) ���� ����� ����� N (> 3). ���� ��� �������� �������� ����� 3, �� ������� True, ���� �� �������� � ������� False.
*/
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� ����� N");
		int n = in.nextInt();
		int p = 3;
		int d = 2;
		
		while (n > p) {

			p = (int) Math.pow(3,d);
			d++;
		}
			if (n == p) {
				System.out.println("true"); 
					} else {
			System.out.println("false");
						 
			}
			
		}
	}
