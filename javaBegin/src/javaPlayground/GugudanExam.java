package javaPlayground;

import java.util.Scanner;

public class GugudanExam {

	public static void main(String[] args) {
		System.out.println("����� ������ �ܼ�?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println("[������"+number+"��]");
		for(int i = 1; i <= number; i++) {
			System.out.println(number+" * "+i+" = "+number*i);
		}
	}

}
