package Lesson_1.Tank;

public class firstTankMethod2 {

	public static void main(String[] args) {
		
		System.out.println(getQuadrant("a","1"));
		System.out.println(getQuadrant("a","2"));
		System.out.println(getQuadrant("b","2")); 
		System.out.println(getQuadrant("g","2"));
		System.out.println(getQuadrant("y","9"));
		
	}
		
		static String getQuadrant(String v, String h){
			String error = "error";
			if ((v=="a"||v=="b"||v=="c"||v=="d"||v=="e"||v=="f"||v=="g"||v=="h"||v=="i")&&
				(h=="1"||h=="2"||h=="3"||h=="4"||h=="5"||h=="6"||h=="7"||h=="8"||h=="9")) {
			
			String hIndex  = "123456789";
			int horizont = hIndex.indexOf(h)*64;

		    
			String vIndex = "abcdefghi";
			int vertikal = vIndex.indexOf(v)*64;


			String rezalt = horizont+"_"+vertikal;
			
			return rezalt;
			}
		return error; 
	}
}	

	

	