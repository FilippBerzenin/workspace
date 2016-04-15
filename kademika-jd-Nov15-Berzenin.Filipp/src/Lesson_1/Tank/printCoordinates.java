package Lesson_1.Tank;

public class printCoordinates {

	public static void main(String[] args) {
		
		printCoordinates("b","1");
		printCoordinates("a","2");
		printCoordinates("d","9");
		printCoordinates("z","1");
		
		
	}
	static void printCoordinates(String v, String h){
				
		String rezalt = getQuadrant(v,h);
		System.out.println(v+h+":"+"("+rezalt+")");
		
	}
	static String getQuadrant(String v, String h){
		String error = "error";
		if ((v=="a"||v=="b"||v=="c"||v=="d"||v=="e"||v=="f"||v=="g"||v=="h"||v=="i")&&
			(h=="1"||h=="2"||h=="3"||h=="4"||h=="5"||h=="6"||h=="7"||h=="8"||h=="9")) {
		
		String hIndex  = "123456789";
		int horizont = hIndex.indexOf(h)*64;

	    
		String vIndex = "abcdefghi";
		int vertikal = vIndex.indexOf(v)*64;


		String rezaltHV = vertikal+"px"+";"+horizont+"px";
		
		return rezaltHV;
		}
	return error; 
}
}
