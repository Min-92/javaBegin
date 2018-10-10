
public class AccessObj {
	public int p = 3; //공용 아무나 쓸수있음
	protected int p2 = 4; //같은패키지는 접근 허용, 다른패키지도 상속받으면 가능
	private int i = 1; //자기 자신만 접근 가능
	int k = 2; //default 아무것도 쓰지 않은경우 자기자신과 같은 패키지 내에서 적근 가능
	
	// public > protected > default > private
	
	
}