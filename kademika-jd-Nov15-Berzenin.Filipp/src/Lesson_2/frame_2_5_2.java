package Lesson_2;

public class frame_2_5_2 {

	public static void main(String[] args) {
		System.out.println(oldEnouge(31));
		System.out.println(oldEnouge(3));
		System.out.println(oldEnouge(-45));
		
	}

	static boolean oldEnouge (int age){
	    boolean x = (age>=21);
	    return x;
	    }
}
