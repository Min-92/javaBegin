
public class Car {

	public String Car;
		//Ÿ�� �ʵ��
		String name;
		int number;
		
		public Car(String name) {
			this.name = name;
		}

		public Car() {
//			this.name = "�̸�����";
//			this.number = 0;
//			
//			�������� �ߺ����� �ʰ� ��� ������
//			
			this("�̸�����",0);
		}
		
		public Car(String name, int number) {
			this.name = name;
			this.number = number;
		}
		
		
		public void run() {
			System.out.println("�޸���"); 
		}
		
}

