package Lesson_3;

import java.util.Arrays;

public class frame_3_9 {

	public static void main(String[] args) {
		int[] data = new int [10];
		data[0] = 1;
		data[1] = 9;
		data[2] = 8;
		data[3] = 1;
		data[4] = 6;
		data[5] = 5;
		data[6] = 4;
		data[7] = 3;
		data[8] = 2;
		data[9] = 1;
		
		int[] data1 = null;
		
		int[] data2 = {7, 4, 5, 3, 5, 8, 9};
		
		int[] data3 = {};
		
		int[] data4 = {-1, -2, -7, 0, 8, 3, 3};
		

		sort(data4);
		System.out.println(Arrays.toString(data4));
		
		
	}
	static void sort (int [] data) {
		
		if (error(data)==true){
			for (int i = 0; i<data.length-1;i++) {
			swap(data, minus(data));}
			}
			if (error(data) == false) {
				System.out.println(-1);
			}
//			System.out.println(System.currentTimeMillis() - time);
		}
	
	static void swap(int [] data, int minus) {

		int mem;
		for (int i = 0; i<data.length-1 && i<minus;i++) {
		if (data[i]>data[i+1]) {
			mem = data[i+1];
			data[i+1]=data[i];
			data[i] = mem;
					}
			}
	}
	static int minus (int[] data){
		int minus = 0;
		for (int i=0; i<data.length-1; i++) {
				{
				int k = data.length;
				minus=k--;
			} 
		} return minus;
	}
	static boolean error (int [] data) {
		if (data != null && data.length != 0) { 
		return true;}
		else return false;
	} 
	}

