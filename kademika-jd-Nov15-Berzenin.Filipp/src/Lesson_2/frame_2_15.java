package Lesson_2;

public class frame_2_15 {

public static void main(String[] args) {
		
		start(10);

	}
	static void start (int number){
		if (number <= 0) {
			System.out.println("Start failed");
		} if (number>0) {while (number > 0) {
			System.out.println(number);
			number--;}
		System.out.println(0);
		System.out.println("Go!");
		}
		}		
}


