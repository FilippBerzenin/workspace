package Lesson_3;

public class frame_3_4 {

	public static void main(String[] args) {
		int [] date1 = {1, 10, 5, 7, 6};
		int [] date2 = {0};
		int [] date3 = {};
		int [] date4 = {0, 0, 15, 25, 16};
		int [] date5 = {-3, 25, 2};
		
	    printArray(date1);
		printArray(date2);
		printArray(date3);
		printArray(date4);
		printArray(date5);
	}
	static void printArray (int[] date) {
		int number = 0;
		
		while (true) {
			if (date != null) {
			if (date.length == 0) {
				System.out.print("[]"); break;}	
			if (number == 0) {
				System.out.print("[");}
			if (number < date.length-1) {
				System.out.print(date[number++]+", ");}
			if (number == date.length-1) {
				System.out.println(date[number]+"]"); break;}
		}}
		} 
		
	}

