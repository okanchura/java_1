package java_part_I_06;

//Tasks 1, 3 , 4, 6
/* 5) Ќачальный вклад в банке равен 1000 руб. „ерез каждый мес€ц раз мер вклада увеличиваетс€ на P процентов
 *  от имеющейс€ суммы (P Ч вещественное число, 0 < P < 25). ѕо данному P определить, через сколько 
 *  мес€цев размер вклада превысит 1100 руб., и вывести найденное количество мес€цев K (целое число) 
 *  и итоговый размер вклада S (вещественное число).
*/
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите размер процентной ставки – (0 < P < 25)");
		int P = in.nextInt();
		float p1 = 1+P/100;
		float d = 1000;
		float f = 1100;
		int K = 0; 
		
	/*	while (d < 1100) {
			d = d*p1; K++;
			
			} */
		
		do {
		 d = d*p1; K++;}
		while (d < f);
		
		System.out.println(" оличество мес€цев K " + K);		
		System.out.println("–азмер вклада на последний мес€ц " + d);


	}
		
}
