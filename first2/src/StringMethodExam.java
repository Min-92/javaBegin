
public class StringMethodExam {

	public static void main(String[] args) {
//		String str = new String("hello");
		String str = "hello";
//		str.length();
		System.out.println(str.length());
		System.out.println(str.concat("world"));
		System.out.println(str);
		
		//string ��ü�� ��������� �ٲ��� ����
		//�������̱� ������ �ٸ����� ������ ����
		
		str = str.concat(" world");
		System.out.println(str);
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(2, 6));
	}

}
