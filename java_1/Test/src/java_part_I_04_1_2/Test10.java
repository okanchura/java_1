package java_part_I_04_1_2;

public class Test10 {

	public static void main(String[] args) {

				/*
				 * 1) ���� ����� ����� A. ��������� ���������� ������������: ������ A ��������
				 * �������������. 
				 * 2) ���� ����� ����� A. ��������� ���������� ������������: ������
				 * A �������� ��������. 
				 * 3) ���� ��� ����� �����: A, B, C. ��������� ����������
				 * ������������: ������������ ������� ����������� A < B < C�. 
				 * 4) ���� ��� ����� �����: A, B, C. ��������� ���������� ������������: ����� �� ���� �� ����� A,
				 * B, C �������������. 
				 * 5) ���� ��� ����� �����: A, B, C. ��������� ����������
				 * ������������: ������ ���� �� ����� A, B, C �������������. 
				 * 6) ���� ����� ������������� �����. ��������� ���������� ������������: ������� �����
				 * �������� �������� �����������. 
				 * 7) ���� ����� x, y, x1, y1, x2, y2. ��������� ���������� ������������:
				 * ������ � ������������ (x, y) ����� ������ ��������������, ����� ������� 
				 * ������� �������� ����� ���������� (x1, y1),
				 * ������ ������ � (x2, y2), � ������� ����������� ������������ ����. 
				 * 8) ���� ����� ����� a, b, c. ��������� ���������� ������������: �����������
				 * ����������� �� ��������� a, b, c�. 
				 * 9) ���� ���������� ���� ��������� ����� x, y
				 * (����� �����, ������� � ��������� 1�8). ��������, ��� ����� ������ ���� �����
				 * (1, 1) �������� ������, ��������� ���������� ������������: ������� ����
				 * �������� �����. 
				 * 10) ���� ���������� ���� ��������� ����� ��������� ����� x1, y1,
				 * x2, y2 (����� �����, ������� � ��������� 1�8). ��������� ����������
				 * ������������: ������ �� ���� ��� ����� ������� � ������ ���� �� ������. 
				 * 
				 * 
				 * 11) ���� ��� ����� � � �. ��������� �� ������� �� ��������� �������������� ����������
				 * � �������������� ��������
				 * 

				 * ================ Home task =====================
				 * ������� - ���, ����� 11
				 */ 
/* 10) ���� ���������� ���� ��������� ����� ��������� ����� x1, y1, x2, y2 (����� �����, ������� � ��������� 1�8). 
 * ��������� ���������� ������������: ������ �� ���� ��� ����� ������� � ������ ���� �� ������. 
*/	 

	int x1 = 3, y1 = 6, x2 = 1, y2 = 8; 
	boolean C = (x1 < 9) && (y1 < 9) && (x2 < 9) && (y2 < 9);
	System.out.println("��������� ���������� ��������� � �������� �����? - " + C);
	

	boolean A = (x1 == x2 && y1 != y2) || (x1 != x2 && y1 == y2) || ((x1 != x2 && y1 != y2) && (Math.abs(x1-x2) == Math.abs(y1-y2))); 
	System.out.println("����� �� ���� ��� ����� ������� � ������ ���� �� ������? - " + A);

	}

}
