package lesson_4;

public class frame_4_7 {

	public static void main(String[] args) {
		double[] numbers = new double[] {-10.5, -9.5, -8.5, -7.5, -6.5, -5.5, -4.5, -3.5, -2.5, -1.5,
				0, 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1}; 
		double el = 1.1;
		
		System.out.println(findElement(numbers, el)); 
		System.out.println(findElement(numbers, 1.2)); 
		}
	
		static int findElement (double[] numbers, double el) {
			if (numbers!=null && numbers.length>0 ) {
			for (int i=0; i<=numbers.length; i++) {
				if (el == numbers[i]) {
					return i;
				} 
				}
			}
			return -1;
		}
}
