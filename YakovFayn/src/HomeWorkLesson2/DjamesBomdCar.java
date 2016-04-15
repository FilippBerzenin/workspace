package HomeWorkLesson2;

public class DjamesBomdCar extends Car {
	
	public int drive (int howLong) {
		int distance = howLong * 180;
		System.out.println(distance);
		return distance;
	}
}
