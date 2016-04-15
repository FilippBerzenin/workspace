import java.util.Arrays;
import java.util.Random;

public class test2 {

	public static void main(String[] args) {
		 String [][] birds = new String [][] {
			{"Type", "Bay (om stock)", "Price, $"},
			{"Eagle", "10", "15"},
			{"Duck",  "10", "3"}
		};
		for (int i = 0;i<birds[0].length;i++) {
//		System.out.print(birds[0][i]+"\t");
		}
//		System.out.print("\n");
		for (int i = 0; i<birds.length; i++) {
			for (int k = 0; k<birds[i].length; k++) {
				System.out.printf("%1s",birds[i][k]+"\t");
				if (k==birds[i].length-1) {
					System.out.print("\n");
				}
		}
	}
//		System.out.printf("%6d%n%6d%n%6d%n%6d%n%6d%n%6d", 666666, 55555, 4444, 333, 22, 1);
	}

}
