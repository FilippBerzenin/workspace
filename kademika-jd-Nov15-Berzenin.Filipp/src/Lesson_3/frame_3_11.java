package Lesson_3;

public class frame_3_11 {

	public static void main(String[] args) {
		String[][] data = new String[6][];
		data [0] = new String[] {"China", "Peking", "1 354 040 000"};
		data [1] = new String[] {"India", "New Deli", "1 210 569 573"};
		data [2] = new String[] {"USA", "Washington D.C.", "316 305 000"};
		data [3] = new String[] {"Indonesia", "Jakarta", "237 641 326"};
		data [4] = new String[] {"Brazil", "Brazilia", "193 946 886"};
		data [5] = new String[] {"Pakistan", "Islamabad", "183 748 060"};
		
		getPapulation(data);
		System.out.println(getPapulation(data));
	}
	static long getPapulation (String[][] data) {
		long sum = 0;
		for(int i=0;i<data.length;i++) {
			String c = data[i][2].replace(" ", "");
			long k = new Integer(c);
			sum += k;
		}
		return sum;
	}
}
