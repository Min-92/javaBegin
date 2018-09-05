
public class MyClass {
//	public 리턴타입 메소드명 (매개변수들 ) { 구현}
	public void method1() {
		System.out.println("m1이 실행됨");
		//매개변수, 리턴타입 없는경우
	}
	public void method2(int x) {
		System.out.println(x + "를 이용한 m2 실행");
		//매개변수 있고 리턴타입 없는경우
	}
	public int method3() {
		System.out.println("m3 실행");
		return 10;
		//매개변수 없고 리턴타입 있는경우
	}
	public void method4(int x, int y) {
		System.out.println(x + y + "m3 실행");
		//매개변수가 두개, 리턴타입 없음
	}
	public int method5(int y) {
		System.out.println(y+"이용한 m5 실행:"); 
		return y*2;
		//매개변수있고 리턴타입 있음
	}
}
