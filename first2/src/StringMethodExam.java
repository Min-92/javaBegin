
public class StringMethodExam {

	public static void main(String[] args) {
//		String str = new String("hello");
		String str = "hello";
//		str.length();
		System.out.println(str.length());
		System.out.println(str.concat("world"));
		System.out.println(str);
		
		//string 객체는 만들어지면 바뀌지 않음
		//참조형이기 때문에 다른값에 문제가 생김
		
		str = str.concat(" world");
		System.out.println(str);
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(2, 6));
	}

}
