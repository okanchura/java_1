package java_part_I_04_1_2;

public class Test3 {

	public static void main(String[] args) {
		// ���� ��� ����� �����: A, B, C. ��������� ���������� ������������: ������������ ������� ����������� A < B < C�.

	int A = 13, B = 16, C = 18;
	boolean A1 = (A < B) && (B < C);
	
	System.out.println("����������� ������� ����������� A < B < C, ��� � = " + A + " B = " + B + " C = " + C + " ? - " + A1);

	}

}
