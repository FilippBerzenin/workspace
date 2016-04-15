package HomeWorkLesson2;

public class carOwner {

	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.start();
		bmw.stop();
		System.out.println(bmw.drive(3)+"km");

		DjamesBomdCar AstonMartin = new DjamesBomdCar();
		AstonMartin.start();
		AstonMartin.drive(5);
	}

}
