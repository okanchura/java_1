package java_part_I_04_2;

public class Test4 {

	public static void main(String[] args) {
	/*	//Даны целые положительные числа A, B, C. 
		//На прямоугольнике размера  A × B размещено максимально возможное количество квадратов со стороной C (без наложений). 
		//Найти количество квадратов, размещенных на прямоугольнике, а также площадь незанятой части прямоугольника.
	 */
		int A = 10, B = 12, C = 5;
		int L = A/C * B/C; 
		double S = A*B - L*Math.pow(C, 2); // в случае использования L*C*C можно использовать int 
	System.out.println("Количество квадратов " + L);
	System.out.println("Площадь незанятой части прямоугольника " + S);
	}

}
