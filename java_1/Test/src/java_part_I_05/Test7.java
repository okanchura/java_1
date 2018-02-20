package java_part_I_05;

// Tasks 1, 3 , 5, 6
/*
 * 7. Дано целое число, лежащее в диапазоне 1–999. 
 * Вывести его строку описание вида «четное двузначное число», «нечетное трехзначное число» и т. Д.
 * 
 * Home Tasks 1-8 (p 5-6)
 */

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		System.out.println("java_part_I_05 Задание 7:");

		Scanner in = new Scanner(System.in);
		System.out.println("Введите целое число");
		int n = in.nextInt();
		
		String A = "четное "; 
		String B = "трехзначное "; 
		int a = n%2; 
		if (a > 0) {A = "нечетное ";} 
		else {
		if (a < 1)	{A = "четное";} 
		}
		if (n > 99) {B = "трехзначное";} 
			else {
		if (n > 9) {B = "двузначное";} 
			else {
		if (n > 0) {B = "однозначное";}	
		

		System.out.println("Это " + A + " " + B + " число");
}}}}