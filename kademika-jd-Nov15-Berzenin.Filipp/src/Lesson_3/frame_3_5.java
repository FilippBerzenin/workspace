package Lesson_3;

public class frame_3_5 {

	public static void main(String[] args) {
		long[] date = new long [10];
		date[0] = 1;
		date[1] = 2;
		date[2] = 3;
		date[3] = 4;
		date[4] = 5;
		date[5] = 6;
		date[6] = 7;
		date[7] = 8;
		date[8] = 9;
		date[9] = 10;
		
		long[] date1 = null;
		
		long[] date2= {1, 4, 5, 7};
		
		
		System.out.println(oddElementSum(date));
		System.out.println(oddElementSum(date1));
		System.out.println(oddElementSum(date2));
	
	
	}
	        static long oddElementSum (long[] date){
				if (date != null) {
					int sum = 0;			
				 for (int i = 1;i<date.length;i+=2) {
				  sum += date[i];
				    } 
				 return sum;
				 }
				return -1;
				}
				 
	}
	

