package javaPlayground;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		//�Է¹ް� for
		System.out.println("����� ������ ����?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if (number<2) {
			System.out.println("2 �̻� ���� �Է��� �ּ���");
		} else if (number>9) {
			System.out.println("9 ���� ���� �Է��� �ּ���");
		} else {
			for(int j = 1; j <= 9; j++) {
				System.out.println(number+" * "+j+"="+number*j);
			}
		}
		//�Է� �ް� while
//		System.out.println("����� ������ ����?");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		
//		System.out.println("[������"+number+"��]");
//		int i = 1;
//		while (i < 10) {
//			System.out.println(number+"*"+i+"="+number*i);		
//			i++;
//		}
		
		
		
		//for�� ��ü ���
		
//		for (int i = 1; i <= 9; i++) {
//			System.out.println("[������"+i+"��]");
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i+" * "+j+"="+i*j);
//			}
//		}
	}
}