package javaPlayground;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		//입력받고 for
		System.out.println("출력할 구구단 단은?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if (number<2) {
			System.out.println("2 이상 값을 입력해 주세요");
		} else if (number>9) {
			System.out.println("9 이하 값을 입력해 주세요");
		} else {
			for(int j = 1; j <= 9; j++) {
				System.out.println(number+" * "+j+"="+number*j);
			}
		}
		//입력 받고 while
//		System.out.println("출력할 구구단 단은?");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		
//		System.out.println("[구구단"+number+"단]");
//		int i = 1;
//		while (i < 10) {
//			System.out.println(number+"*"+i+"="+number*i);		
//			i++;
//		}
		
		
		
		//for로 전체 출력
		
//		for (int i = 1; i <= 9; i++) {
//			System.out.println("[구구단"+i+"단]");
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i+" * "+j+"="+i*j);
//			}
//		}
	}
}