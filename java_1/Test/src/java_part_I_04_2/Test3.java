package java_part_I_04_2;

public class Test3 {

	public static void main(String[] args) {
		//Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.

		int a = 459;
		int b = a%10, d = a/100, c = (a - d*100 - b)/10; //c оптимизировать к 2м операциям
		
	System.out.println("число " + b + c + d);
	}

}
