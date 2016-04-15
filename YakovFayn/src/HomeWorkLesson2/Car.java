package HomeWorkLesson2;

public class Car {

	public void start () {
		String start = "Srart";
		System.out.println(start);
	}
	public void stop() {
		String stop = "Stop";
		System.out.println(stop);
	}
	public int drive (int howLong) {
		int distance = howLong * 60;
		return distance;
	}
}
