package Practice1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		double count = sc.nextInt();
		System.out.println("�Է��� ���ڴ�" + count);
		
		Vehicle vehicle  = new Vehicle(count);
		
		System.out.println(vehicle.getAllCount());
		
		Car car = new Car(vehicle.getAllCount()*0.6);
		Bus bus = new Bus(vehicle.getAllCount()*0.6);
		System.out.println(car.getNumCar());
		System.out.println(bus.getNumBus());
		
		
//		int count = 10;
//		Vehicle vehicle = new Vehicle(count);
		
	}

}
