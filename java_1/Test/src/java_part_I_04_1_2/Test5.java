package java_part_I_04_1_2;

public class Test5 {

	public static void main(String[] args) {
		// Даны три целых числа: A, B, C. Проверить истинность высказывания: «Ровно одно из чисел A, B, C положительное».

		int A = -13, B = -16, C = 18;
		boolean A1 = (A > 0) && (B < 0) && (C < 0) || (A < 0) && (B > 0) && (C < 0) || (A < 0) && (B < 0) && (C > 0);
		
		System.out.println("Ровно одно из чисел A, B, C, где А = " + A + " B = " + B + " C = " + C + " положительное? - " + A1);

	}

}
