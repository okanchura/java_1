package java_part_I_04_1_2;

import java.math.BigDecimal;

public class TestHomeTask {

	public static void main(String[] args) {

/* «адание на дом: 
 * приехало m спортсменов
 * их поселили в комнаты по n человек
 * —колько комнат нужно?
 * Note: условные операции (boolean) не использовать
*/
	System.out.println("«адание TestHomeTask");
	
	double m = 10, n = 3; 
	System.out.println("ѕриехало " + m + " спортсменов. »х поселили в комнаты по " + n + " человек");
	double a1 = m/n;
	int a2 = (int) a1;
	double a3 = (double) a2;
	//double a4 = a1-a3;
	
	//java.math.BigDecimal x = new java.math.BigDecimal(12.1354678578862);
	//x = x.setScale(1, java.math.BigDecimal.ROUND_CEILING);
	
	BigDecimal a = new BigDecimal(a1);
	BigDecimal b = new BigDecimal(a3);

	//	¬место этого следует использовать методы .compareTo() и .signum().

	int A2 = (int) (a.compareTo(b)); // возвращает (-1 если a < b), (0 если a == b), (1 если a > b)
	int A = (int) a1 + A2;
	//a.signum(); // возвращает (-1 если a < 0), (0 если a == 0), (1 если a > 0)
	System.out.println("Ќужно " + A + " комнат");
	
	/* ѕравильно решение задачи (не использу€  условные операции, в т.ч. compareTo )

	*/  
	System.out.println("«адание TestHomeTask v1");
	 // решение задачи v1
	int m1 = 11, n1 = 3;
	System.out.println("ѕриехало " + m1 + " спортсменов. »х поселили в комнаты по " + n1 + " человек");
	int A1 = (m1+n1-1)/n1;
	System.out.println("Ќужно " + A1 + " комнат");
	
	System.out.println("«адание TestHomeTask v2");
	// решение задачи v2
	int m2 = 16, n2 = 3;
	System.out.println("ѕриехало " + m2 + " спортсменов. »х поселили в комнаты по " + n2 + " человек");
	int S = m2/n2;	
	int O = m2 - S*n2; // O - оставшеес€ количество спортсменов (если O = 0, то все комнаты полностью зан€ты) 
	int R = 1%(O+1); //интегер (только цела€ часть от делени€) 
	// ≈сли значение O = 0, то деление 1 на 1 даст 1,0 (остаток от делени€ = 0) 
	// ≈сли значение O > 0, то деление 1 на число более 1 даст остаток от делени€ = 1 
	// ибо ни разу поделить не удалось - соответственно остаток = 1 
	int A3 = S + R;
	System.out.println("Ќужно " + A3 + " комнат " + O + "   " + R);
	
	}

}
