
public class BusExam2 {

	public static void main(String[] args) {
//		Bus2 bus = new Bus2();
//		bus.run();
		Car4 c = new Bus2();
		c.run();
//		c.ppangppang();
		
		Bus2 bus = (Bus2)c ;
		bus.run();
		bus.ppangppang();
	}
}
