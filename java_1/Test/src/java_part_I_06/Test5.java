package java_part_I_06;

//Tasks 1, 3 , 4, 6
/* 5) ��������� ����� � ����� ����� 1000 ���. ����� ������ ����� ��� ��� ������ ������������� �� P ���������
 *  �� ��������� ����� (P � ������������ �����, 0 < P < 25). �� ������� P ����������, ����� ������� 
 *  ������� ������ ������ �������� 1100 ���., � ������� ��������� ���������� ������� K (����� �����) 
 *  � �������� ������ ������ S (������������ �����).
*/
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������ ���������� ������ � (0 < P < 25)");
		int P = in.nextInt();
		float p1 = 1+P/100;
		float d = 1000;
		float f = 1100;
		int K = 0; 
		
	/*	while (d < 1100) {
			d = d*p1; K++;
			
			} */
		
		do {
		 d = d*p1; K++;}
		while (d < f);
		
		System.out.println("���������� ������� K " + K);		
		System.out.println("������ ������ �� ��������� ����� " + d);


	}
		
}
