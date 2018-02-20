package java_part_I_04_1_1;

public class TestBonus {

	public static void main(String[] args) {
		
		System.out.println("Задание Bonus v1: ");
		//Даны две переменные - поменять их значение местами
		int B01 = 7, B02 = 45;
		int A01 = B02, A02 = B01;
		
		System.out.println("Даны две переменные: A = " + B01 + " и B = " +  B02);
		System.out.println("А теперь переменные: A = " + A01  + " и B = " +  A02);

		/*
		 * ================ Home task =====================
		 */
			
		System.out.println("Задание Bonus v2: ");
		//Даны две переменные - поменять их значение местами (через одну переменную)
		int C01 = 54, C02 = 13;
		System.out.println("Даны две переменные: A = " + C01 + " и B = " +  C02);
		
		int D = C02;
		C02 = C01;
		System.out.println("А теперь переменные: A = " + D  + " и B = " +  C02);
		
		System.out.println("Задание Bonus v3: ");
		//Даны две переменные - поменять их значение местами (через одну переменную string)
		
		int F01 = 9, F02 = 10;
		System.out.println("Даны две переменные: A = " + F01 + " и B = " +  F02);
		
		String G = "A = " + F02 + " и B = " + F01;
		System.out.println("А теперь переменные: " + G);
				
		//Даны две переменные - поменять их значение местами 
		// FEEDBACK: В "бонусном" - через String ненужно и неправильно :)
		// >>> имеется ввиду только переназначение переменных
		// то есть:
		System.out.println("Задание Bonus v4 (без String): ");
		
		int a=9, b=8;
		System.out.println("Даны две переменные: A " + a + " и B = " +  b);
		
		int c=a;
		a=b; b=c;
		System.out.println("А теперь переменные: A " + a + " и B = " +  b);
		
	}

}
