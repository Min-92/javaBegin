
public class MyClass {
//	public ����Ÿ�� �޼ҵ�� (�Ű������� ) { ����}
	public void method1() {
		System.out.println("m1�� �����");
		//�Ű�����, ����Ÿ�� ���°��
	}
	public void method2(int x) {
		System.out.println(x + "�� �̿��� m2 ����");
		//�Ű����� �ְ� ����Ÿ�� ���°��
	}
	public int method3() {
		System.out.println("m3 ����");
		return 10;
		//�Ű����� ���� ����Ÿ�� �ִ°��
	}
	public void method4(int x, int y) {
		System.out.println(x + y + "m3 ����");
		//�Ű������� �ΰ�, ����Ÿ�� ����
	}
	public int method5(int y) {
		System.out.println(y+"�̿��� m5 ����:"); 
		return y*2;
		//�Ű������ְ� ����Ÿ�� ����
	}
}
