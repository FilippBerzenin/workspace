package Lesson_3;

public class frame_3_6 {

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
		
		System.out.println(averge(data));
		System.out.println(averge(data1));
		System.out.println(averge(data2));

	}
		static double averge (int []data) {
			if (data == null || data.length==0) {
	    		return -1;
	    	} double rezult = 0;
	    	for (double index : data) {
	    		rezult += index;
	    	} return rezult/data.length;
		}
}
