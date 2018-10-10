package javaPlayground;

import java.util.Scanner;

public class GugudanExam2 {

	public static void main(String[] args) {
		System.out.println("출력할 구구단 단수? ex) 4,5");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int i = 1; i <= second; i++) {
			System.out.println(first+" * "+i+" = "+first*i);
		}
		
		
		
	}
}
