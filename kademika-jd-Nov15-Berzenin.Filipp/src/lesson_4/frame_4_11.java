package lesson_4;

public class frame_4_11 {

public static void main(String[] args) {
		
		String[][] array = new String[][] {{}, {}};
		String[][] array1 = new String[][] {{"Oleg"}, {"Inna" ,"Smith", "25"}, {"Irina", "Koval"}};
		String[][] array2 = new String[][] {{}, {"Oleg", "Kotov", "16"}, {}};
		String[][] array3 = new String[][] {{"Oleg"}, {"Anton"}, {}, {"Anna", "25"}};
		
		System.out.println("--------Array-------");
		printArray(array);
		System.out.println("--------Array-------");
		printArray(array1);
		System.out.println("--------Array-------");
		printArray(array2);
		System.out.println("--------Array-------");
		printArray(array3);
	}
	static void printArray(String[][] array) {
		if (error(array) == true) {
			for (int i = 0;i<array.length; i++) {
				printArrayIn(array[i]);
			} 		
		}  
	}
	static void printArrayIn(String[] array) {
		for (int i = 0; i<array.length; i++) {
			if (i==array.length-1) {
				System.out.println(array[i]);
			}
			else System.out.print(array[i]+ " ");}
	}
	
	
	static boolean error (String[][] array){
		if (array != null && array.length > 0) {
			return true;
		}
		return false;
	}
}