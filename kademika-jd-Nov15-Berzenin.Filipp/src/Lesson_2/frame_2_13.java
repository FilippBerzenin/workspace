package Lesson_2;

public class frame_2_13 {

	static void hello (String greating) {
		greating = "Hello" + greating;
	}
	
	public static void main(String[] args) {
		String hello = "World";
		hello += "!";
		hello(hello);
		System.out.println(hello);

	}

}
