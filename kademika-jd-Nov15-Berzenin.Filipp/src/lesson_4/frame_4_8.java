package lesson_4;

import java.util.Arrays;

public class frame_4_8 {

	public static void main(String[] args) {
		int[] numbers = new int[] {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1,
				0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
			
		copyArray(numbers, 0, new int [10], 0, 2);
		copyArray(numbers, 0, new int [10], 1, 10);
		copyArray(numbers, 0, new int [21], 0, 21);
		copyArray(numbers, 4, new int [10], 1, 9);
		copyArray(numbers, 13, new int [10], 1, 9);
		copyArray(numbers, 4, new int [10], 4, 2);
		copyArray(numbers, 20, new int [10], 9, 1);
		copyArray(numbers, 21, new int [10], 9, 1);
		copyArray(numbers, 0, new int [10], 0, 10);

	}
		static void copyArray(int[] src, int srcPos, int [] dest, int destPos, int lenght) {
			if (src != null && src.length >0 && dest!=null && dest.length>0 && dest.length>=lenght &&
					srcPos<=src.length && srcPos>=0 && (srcPos+lenght)<=src.length &&
					(destPos+lenght)<=dest.length && destPos>=0 && lenght>0 && lenght<=dest.length &&
					lenght<=src.length) {
				
				for (int i = srcPos, k = destPos, j=0; j<=lenght-1; i++, k++, j++) {
					dest[k] = src[i];}
			//	System.out.println(Arrays.toString(dest));
			} else System.out.println(-1); 
					
			}
		}

