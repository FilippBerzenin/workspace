package Lesson_3;

import java.util.Arrays;

public class frame_3_7 {

	public static void main(String[] args) {
		int[] data = new int [10];
		data[0] = 1;
		data[1] = 2;
		data[2] = 3;
		data[3] = 4;
		data[4] = 5;
		data[5] = 6;
		data[6] = 7;
		data[7] = 8;
		data[8] = 9;
		data[9] = 10;
		
		int[] data1 = null;
		
		int[] data2 = {1, 4, 5, 7};
		
		int[] data3 = {};
		
		swap(data);
		swap(data1);
		swap(data2);
		swap(data3);

		
	}
	static void swap (int[] data){
		if (data == null || data.length == 0 || data.length<2){
			System.out.println(-1); 
			return;
		}
		
			
		else for (int i = 0;i<data.length-1 && data.length>=2;i++) {
			int mem = data[i];
			data[i]=data[i+1];
			data[i+1] = mem;
			}
	}
}
