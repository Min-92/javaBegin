import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		int value = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			//�ݺ��� �����
			value = scan.nextInt();
			System.out.println("�Է¹��� �� : ");
		}while(value != 10);
		
		System.out.println("�ݺ��� ����!!");
	}
	

}
