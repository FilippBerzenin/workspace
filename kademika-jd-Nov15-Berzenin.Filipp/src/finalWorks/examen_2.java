package finalWorks;

import java.util.Arrays;

public class examen_2 {

	public static void main(String[] args) {
	int [][] chislo = new int[6][];
	for(int i = 0, k = 6; k>1; i++, k--) {
		chislo[i] = new int [k];
		}
	for (int i = 0; i<chislo.length-1; i++) {
		for (int k = 0; k<chislo[i].length-1; k++) {
			chislo[i][k] = (int) (Math.random()*15);
		}
//		System.out.println(Arrays.toString(chislo[i]));
	}
		for (int i = 0; i<chislo.length-1; i++) {
			for (int k = 0; k<chislo[i].length-1; k++) {
				if (chislo[i][k]>chislo[i][k+1]) {
					int mem = chislo[i][k];
					chislo[i][k] = chislo[i][k+1];
					chislo[i][k+1] = mem;
				}
			}
//			System.out.println(Arrays.toString(chislo[i]));
		}
		int sum = 0;
		for (int i = 0; i<chislo.length-1; i++) {
			sum += chislo[i][chislo[i].length-1];
		}
//		System.out.println(sum);
		String sumString = String.valueOf(sum);
		System.out.println(sumString);
		String code = "QWERTYUIO";
		String rezult="";
		for (int i = 0; i<sumString.length();i++) {
			char index =sumString.charAt(i);
			String g = String.valueOf(index);
			int klo = Integer.parseInt(g);
			char h = code.charAt(klo);
			System.out.println(h);
			rezult += h;
		}
		System.out.println(rezult);
	}

}
