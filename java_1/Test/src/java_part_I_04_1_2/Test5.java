package java_part_I_04_1_2;

public class Test5 {

	public static void main(String[] args) {
		// ���� ��� ����� �����: A, B, C. ��������� ���������� ������������: ������ ���� �� ����� A, B, C �������������.

		int A = -13, B = -16, C = 18;
		boolean A1 = (A > 0) && (B < 0) && (C < 0) || (A < 0) && (B > 0) && (C < 0) || (A < 0) && (B < 0) && (C > 0);
		
		System.out.println("����� ���� �� ����� A, B, C, ��� � = " + A + " B = " + B + " C = " + C + " �������������? - " + A1);

	}

}
