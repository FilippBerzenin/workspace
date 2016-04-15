

package Lesson_3;

import java.util.Arrays;

public class frame_3_8 {

	public static void main(String[] args) {
		int[] data = new int [10];
		data[0] = 10;
		data[1] = 9;
		data[2] = 8;
		data[3] = 7;
		data[4] = 6;
		data[5] = 5;
		data[6] = 4;
		data[7] = 3;
		data[8] = 2;
		data[9] = 1;
		
		int[] data1 = null;
		
		int[] data2 = {7, 4, 5, 3, 5, 8, 2};
		
		int[] data3 = {};
		
		int[] data4 = {-2, -2, -7, 0, 8, 3, 3};

		sort(data);
		sort(data1);
		sort(data2);
		sort(data3);
		sort(data4);
		
		System.out.println(Arrays.toString(data));
//		System.out.println(Arrays.toString(data1));
		System.out.println(Arrays.toString(data2));
//		System.out.println(Arrays.toString(data3));
		System.out.println(Arrays.toString(data4));

	}
	
	static boolean error (int [] data) {
		if (data != null && data.length != 0) { 
		return true;}
		else return false;
	} 

	static void sort (int [] data) {
		if(error(data) == true) {
			sortByElemrnts(data);
		} if (error(data) == false) {
			System.out.println(-1);
		}
	}
	
	static void sortByElemrnts(int[] data){
		for (int k: data) {
		for (int i = 0; i<data.length-1;i++) {
			
			if (data[i]>data[i+1]) {
				int mem = data[i];
				data[i]=data[i+1];
				data[i+1] = mem;}
				}
		} 
	}
}

