package java_part_I_05;

// Tasks 1, 3 , 5, 6
/*
 * 3. ���� ��� ����� �����. ����� ���������� ������������� ����� � �������� ������.
 */
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("java_part_I_05 ������� 3:");
		
		Scanner in = new Scanner(System.in);
		System.out.println("������� 1� �����");
		int n1 = in.nextInt();
		System.out.println("������� 2� �����");
		int n2 = in.nextInt();
		System.out.println("������� 3� �����");
		int n3 = in.nextInt();
		int count = 0;
		
		if (n1 > 0) {
			count = count + 1;
				} 
		if (n2 > 0) {
			count = count + 1;
				} 
		if (n3 > 0) {
			count = count + 1;
				}
		System.out.println(count);

	}

}
