package java_part_I_04_1_2;

public class Test3 {

	public static void main(String[] args) {
		// Даны три целых числа: A, B, C. Проверить истинность высказывания: «Справедливо двойное неравенство A < B < C».

	int A = 13, B = 16, C = 18;
	boolean A1 = (A < B) && (B < C);
	
	System.out.println("Справедливо двойное неравенство A < B < C, где А = " + A + " B = " + B + " C = " + C + " ? - " + A1);

	}

}
