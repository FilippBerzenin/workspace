package Lesson_2;

public class frame_2_3 {

	public static void main(String[] args) {
	
		System.out.println(square(11));
		System.out.println(square(10));
		System.out.println(square(145.0));
		System.out.println(square(11.0));

	}
	
	static double square (double number){
		
		return number * number;
	}
	
	static int square (int number){
		return number * number;
		
	}
}
