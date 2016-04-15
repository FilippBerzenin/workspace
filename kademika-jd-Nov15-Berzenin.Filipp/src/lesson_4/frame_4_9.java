package lesson_4;

import java.util.Arrays;

public class frame_4_9 {

	public static void main(String[] args) {
		
		String str = "Filipp";
		String str1 = "";
		String str2 = null;
		String str3 = "k";
		String str4 = "fk";
		String str5 = "Berzenin Filipp";

//		System.out.println(invers(str));
//		System.out.println(invers(str1));
//		System.out.println(invers(str2));
//		System.out.println(invers(str3));
//		System.out.println(invers(str4));
//		System.out.println(invers(str5));
		
	}
		static String invers (String str){
			if (error(str) == true) {
				str = inversArray(str);
				return str;
			}
			return "-1";
		}
		static boolean error (String str) {
			if (str != null && str.length()>=2) {
				return true;
			}
			return false;
		}
		static String inversArray (String str){
			char[] work = str.toCharArray();
			int length = work.length;
			char[] rezult = new char[length];
			for (int i = 0, k = length-1; i<=length-1; i++, k--) {
				rezult[i] = work[k];
				}
			String rez = new String(rezult); 
			return rez;
		}
}
