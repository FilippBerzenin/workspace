package Lesson_1.Tank;

public class printCoordinates2 {

	public static void main(String[] args) {
		
		printCoordinates("a","1");
		printCoordinates("a","2");
		printCoordinates("d","9");
		printCoordinates("h","1");
		printCoordinates("z","1");

		
		
	}
	static void printCoordinates(String v, String h){
				
		String forPrint = getQuadrant(v,h);
		if (forPrint == "error") {
			System.out.println("error");
		}
		else {String forPrintFirst = forPrint.substring(0, forPrint.indexOf("_"));
		String forPrintSecond = forPrint.substring(forPrint.indexOf("_")+1);
		
		System.out.println(v+h+":"+"("+forPrintFirst+"px"+";"+forPrintSecond+"px"+")");}
		
	}
	static String getQuadrant(String v, String h){
		String error = "error";
		if ((v=="a"||v=="b"||v=="c"||v=="d"||v=="e"||v=="f"||v=="g"||v=="h"||v=="i")&&
			(h=="1"||h=="2"||h=="3"||h=="4"||h=="5"||h=="6"||h=="7"||h=="8"||h=="9")) {
		
		String vResult = null;
		if (v=="a") {vResult="0";}
		if (v=="b") {vResult="64";}
		if (v=="c") {vResult="128";}
		if (v=="d") {vResult="192";}
		if (v=="e") {vResult="256";}
		if (v=="f") {vResult="320";}
		if (v=="g") {vResult="384";}
		if (v=="h") {vResult="448";}
		if (v=="i") {vResult="512";}
		
		
		String hResult = null;
		if (h=="1") {hResult="0";}
		if (h=="2") {hResult="64";}
		if (h=="3") {hResult="128";}
		if (h=="4") {hResult="192";}
		if (h=="5") {hResult="256";}
		if (h=="6") {hResult="320";}
		if (h=="7") {hResult="384";}
		if (h=="8") {hResult="448";}
		if (h=="9") {hResult="512";}
		
		String rezalt = vResult+"_"+hResult;
		
		return rezalt;}
	return error; 
}
}
