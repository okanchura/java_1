package java_part_I_04_1_2;

public class Test9 {

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
/*  9) ���� ���������� ���� ��������� ����� x, y (����� �����, ������� � ��������� 1�8). 
 * ��������, ��� ����� ������ ���� ����� (1, 1) �������� ������, ��������� ���������� ������������: ������� ���� �������� �����. 
*/	 

	int x = 4, y = 6;
	boolean C = (x < 9) && (y < 9);
	System.out.println("������ ����������  x = " + x + ", y = " + y + " ��������� � �������� �����? - " + C);
	
	boolean X = x%2 == 0; //������ A �������� ������ 
	boolean Y = y%2 == 0; //������ A �������� ������ 
	boolean A = X && Y; //��� ���������� ����� ������ �� ��������� ����� - ������
	
	System.out.println("������ ���� � ������������ x = " + x + ", y = " + y + " �������� �����? - " + A);

	}

}
