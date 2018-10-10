
public class Car {

	public String Car;
		//타입 필드명
		String name;
		int number;
		
		public Car(String name) {
			this.name = name;
		}

		public Car() {
//			this.name = "이름없음";
//			this.number = 0;
//			
//			같은내용 중복하지 않고 사용 가능함
//			
			this("이름없음",0);
		}
		
		public Car(String name, int number) {
			this.name = name;
			this.number = number;
		}
		
		
		public void run() {
			System.out.println("달리다"); 
		}
		
}

