package Lesson_2;

public class frame_2_16 {

	public static void main(String[] args) {
		
		printNumber(5, 10);

	}
	static void printNumber (int i, int n){
		while (i<n) {
			n++;
			System.out.println(n);
			i=i+n;
			
		}
	}
	
}

