package Lesson_1.Tank;

public class firstTankMethod {

	public static void main(String[] args) {
		
		System.out.println(getQuadrant("a","1"));
		System.out.println(getQuadrant("a","2"));
		System.out.println(getQuadrant("b","2")); 
		System.out.println(getQuadrant("g","2"));
		System.out.println(getQuadrant("y","9"));
					                        		
	}
	
	/*
	 *  - Tanks - 
	 */
		static String getQuadrant (String v, String h){
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
			String result = hResult+"_"+vResult; 
			return result;}
			
			else return error;
		}
			}
		

	


