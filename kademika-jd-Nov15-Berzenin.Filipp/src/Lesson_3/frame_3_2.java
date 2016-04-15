package Lesson_3;

import java.io.ObjectInputStream.GetField;

public class frame_3_2 {

	public static void main(String[] args) {
		
//		int [] date = {1, 10, 5, 7, 6};
//		int [] date = {0};
//		int [] date = {};
//		int [] date = {0, 0, 15, 25, 16};
		int [] date = {-3, 25, 2};
		
		System.out.println(getLast(date));
	}

	public static int getLast (int[] data) {
		if (data.length>0) {
			int last  = data[data.length-1];
			 return last;}
		else return -1;
	}
}
