package Lesson_2;

public class frame_2_6 {

	public static void main(String[] args) {
		System.out.println(min(1,2,3));
		System.out.println(min(10,2,3));
		System.out.println(min(10,5,10));
		System.out.println(min(-10,0,3));
			
	}
	static int min (int a, int b, int c){
		if (a<b && a<c) {return a;}
		else if (b<a && b<c) {return b;}
		return c;
		}
	
	static int min (int a, int b, int c, int d){
		if (a<b) {
			if (a<c) {
				return a;} {return 0;}
			}
		
		if (b<a) {if (b<c) {
			return b;} {
				return 0;}
			}
		
		if (c<a) {
			if (c<b) {
				return c;} 
		
		
		
	}
		return 0;
}  
}
	

