
public class LedExam {

	public static void main(String[] args) {
		TV tv = new LedTV();
		tv.turnOn();
		tv.changeChannel(8);
		tv.changeVolume(40);
		tv.turnOff();
	}

}
