package Lesson_2;

public class frame_2_7 {

	public static void main(String[] args) {
		System.out.println(isSpring(3));
		System.out.println(isSpring(2));
		System.out.println(isSpring(5));
		System.out.println(isSpring(-9));
		System.out.println(isSpring(12));
		System.out.println(isSpring(14));
		
	}
		
		static int isSpring (int month){
			if (month>2 && month<6 && month<13 && month>0) {
				return 1;}
				
		    if ((month<3 && month<13 && month>0) || (month>5 && month<13 && month>0)) {
				return 0;} 
			
		    return -1;
			
			}
	}

	


