package java_part_I_05;

// Tasks 1, 3 , 5, 6
/*
 * 7. ���� ����� �����, ������� � ��������� 1�999. 
 * ������� ��� ������ �������� ���� ������� ���������� �����, ��������� ����������� ����� � �. �.
 * 
 * Home Tasks 1-8 (p 5-6)
 */

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		System.out.println("java_part_I_05 ������� 7:");

		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� �����");
		int n = in.nextInt();
		
		String A = "������ "; 
		String B = "����������� "; 
		int a = n%2; 
		if (a > 0) {A = "�������� ";} 
		else {
		if (a < 1)	{A = "������";} 
		}
		if (n > 99) {B = "�����������";} 
			else {
		if (n > 9) {B = "����������";} 
			else {
		if (n > 0) {B = "�����������";}	
		

		System.out.println("��� " + A + " " + B + " �����");
}}}}