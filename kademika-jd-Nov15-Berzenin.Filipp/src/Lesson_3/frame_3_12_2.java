package Lesson_3;

import java.util.Arrays;

public class frame_3_12_2 {

	public static void main(String[] args) {
		int [] data1 = new int[] {1, 2, 3};
		int [] data2 = new int[] {3, 2, 1};
		
		union(data1, data2);
		
		System.out.println(Arrays.toString(union(data1, data2)));

	}
		static int[] union (int[] data1, int[] data2) {
			int[] data =new int[data1.length+data2.length];
			
			for(int i = 0, k = 0; i<data.length; i++, k++) {
				if (i<data1.length) {
					data[i] = data1[i];
				}
				else {
					data[i] = data2[k];
				}
				
//			} for (int i = data1.length, k = 0; i<data.length; i++, k++) {
//				data[i] = data2[k];
//				}
			
	}return data;

}
}