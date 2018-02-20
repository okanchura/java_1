package java_part_I_04_1_2;

import java.math.BigDecimal;

public class TestHomeTask {

	public static void main(String[] args) {

/* ������� �� ���: 
 * �������� m �����������
 * �� �������� � ������� �� n �������
 * ������� ������ �����?
 * Note: �������� �������� (boolean) �� ������������
*/
	System.out.println("������� TestHomeTask");
	
	double m = 10, n = 3; 
	System.out.println("�������� " + m + " �����������. �� �������� � ������� �� " + n + " �������");
	double a1 = m/n;
	int a2 = (int) a1;
	double a3 = (double) a2;
	//double a4 = a1-a3;
	
	//java.math.BigDecimal x = new java.math.BigDecimal(12.1354678578862);
	//x = x.setScale(1, java.math.BigDecimal.ROUND_CEILING);
	
	BigDecimal a = new BigDecimal(a1);
	BigDecimal b = new BigDecimal(a3);

	//	������ ����� ������� ������������ ������ .compareTo() � .signum().

	int A2 = (int) (a.compareTo(b)); // ���������� (-1 ���� a < b), (0 ���� a == b), (1 ���� a > b)
	int A = (int) a1 + A2;
	//a.signum(); // ���������� (-1 ���� a < 0), (0 ���� a == 0), (1 ���� a > 0)
	System.out.println("����� " + A + " ������");
	
	/* ��������� ������� ������ (�� ���������  �������� ��������, � �.�. compareTo )

	*/  
	System.out.println("������� TestHomeTask v1");
	 // ������� ������ v1
	int m1 = 11, n1 = 3;
	System.out.println("�������� " + m1 + " �����������. �� �������� � ������� �� " + n1 + " �������");
	int A1 = (m1+n1-1)/n1;
	System.out.println("����� " + A1 + " ������");
	
	System.out.println("������� TestHomeTask v2");
	// ������� ������ v2
	int m2 = 16, n2 = 3;
	System.out.println("�������� " + m2 + " �����������. �� �������� � ������� �� " + n2 + " �������");
	int S = m2/n2;	
	int O = m2 - S*n2; // O - ���������� ���������� ����������� (���� O = 0, �� ��� ������� ��������� ������) 
	int R = 1%(O+1); //������� (������ ����� ����� �� �������) 
	// ���� �������� O = 0, �� ������� 1 �� 1 ���� 1,0 (������� �� ������� = 0) 
	// ���� �������� O > 0, �� ������� 1 �� ����� ����� 1 ���� ������� �� ������� = 1 
	// ��� �� ���� �������� �� ������� - �������������� ������� = 1 
	int A3 = S + R;
	System.out.println("����� " + A3 + " ������ " + O + "   " + R);
	
	}

}
