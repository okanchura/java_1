package java_part_I_04_2;

public class Test3 {

	public static void main(String[] args) {
		//���� ����������� �����. ������� �����, ���������� ��� ��������� ��������� ����� ������ ������.

		int a = 459;
		int b = a%10, d = a/100, c = (a - d*100 - b)/10; //c �������������� � 2� ���������
		
	System.out.println("����� " + b + c + d);
	}

}
