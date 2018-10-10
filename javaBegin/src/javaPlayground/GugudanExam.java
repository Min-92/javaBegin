package javaPlayground;

import java.util.Scanner;

public class GugudanExam {

	public static void main(String[] args) {
		System.out.println("출력할 구구단 단수?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println("[구구단"+number+"단]");
		for(int i = 1; i <= number; i++) {
			System.out.println(number+" * "+i+" = "+number*i);
		}
	}

}
