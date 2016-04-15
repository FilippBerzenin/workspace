package lesson_4;

import java.util.Arrays;
import java.util.Random;

public class test {

	static String [][] name = new String [][] 
			{{"Ivanov", "Sergey"}, {"Petrov", "Andrey"}, {"Sinica", "Anna"}, {"Ivanov", "Petr"},
			{"Berzenin", "Filipp"}, {"Yakimenko", "Maksim"}, {"Yakimenka", "Maks"}}; 
	static String [][] subject = new String [][] 
			{{"Matimatika", "12"}, {"English", "10"}, {"Computer science", "12"}, {"Geography", "8"}};
	static String [] rating  = new String [] 
			{"1", "2", "3", "4", "5"};
	
	static String pupilSurname = "Yakimenka";
	static String pupilName = "Maks";

	
		public static void main(String[] args) throws Exception {
			
		printStatisticForOne(indexName(name), cartulary(name, subject, rating, indexName(name)));
		
//		printStatisticForAll(indexName(name), cartulary(name, subject, rating, indexName(name)));
		
//		printStatisticBadRatingForOne(indexName(name), cartulary(name, subject, rating, indexName(name))); 
		
		
		}
		
//			static void printStatisticBadRatingForOne (String [][] indexName, String [][][] cartulary) throws Exception {
//				String index = nameRating (pupilSurname, pupilName, indexName(name));
//				int i = new Integer(index)-1;
//				System.out.println(indexName[i][0]+" "+indexName[i][1]);
//				for (int k = 0; k<subject.length; k++) {
//					System.out.print(subject[k][0]);
//					for (int j = 1; j<cartulary[i][k+1].length-1; j++ ) {
//						if (cartulary[i][k+1][j].equals("1") || cartulary[i][k][j].equals("2")) {
//							System.out.println("!");
//							for (j = 0; j<cartulary[i][k+1].length-1; j++ ) {
//								if (cartulary[i][k+1][j].equals("1") || cartulary[i][k][j].equals("2")) {
//									int badRating = +1;
//								}
//							}
//						}
//					}
//				}
//			}
		
			static void printStatisticForAll (String [][] indexName, String [][][] cartulary) throws Exception {
			for (int i=0;i<indexName.length;i++) {
				System.out.println(indexName[i][0]+" "+indexName[i][1]);
				for (int k = 1; k<subject.length+1; k++) {
					System.out.println(Arrays.toString(cartulary[i][k]));
				}
			System.out.println();
			}
		}
		
		
		static void printStatisticForOne (String [][] indexName, String [][][] cartulary) throws Exception {
			String index = nameRating (pupilSurname, pupilName, indexName(name));
			int i = new Integer(index)-1;
			System.out.println(indexName[i][0]+" "+indexName[i][1]);
			for (int k = 1; k<subject.length+1; k++) {
			System.out.println(Arrays.toString(cartulary[i][k]));
			}
		}
	
		static String nameRating (String pupilSurname, String pupilName, String [][] indexName) {
			String indexPupil = null;
			for (int i = 0; i<indexName.length; i++) {
				if (indexName[i][0].equals(pupilSurname)==true && indexName[i][1].equals(pupilName)==true ) {
					indexPupil = indexName[i][2];
				}
			} System.out.print(indexPupil+". "); 
			return indexPupil;
		}
		
		public static String[][][] cartulary (String[][] name, String [][] subject, String [] rating, String [][] indexName) throws Exception {
			String [][][] cartulary = new String [name.length][subject.length+1][lengthHours(subject)]; // ��� ������ ������������� ������������ ��������.
			cartulary[0][0] = new String[1]; // ��� ���� ������� ����, ���������� ����� ������.
			hoursLength(cartulary);
			for (int i = 0; i<indexName.length; i++) {
				cartulary[i][0][0] = indexName[i][2];
				for (int k = 1, j = 0;k<subject.length+1; k++, j++) {
					cartulary[i][k][0] = subject[k-1][0]; 
				}
			} 
			RatingFill(cartulary);
			return cartulary;
		}
		
//		static void RatingFill (String [][][] cartulary) throws Exception { // ���������� ����� � �������� ���������. ��������, �� �� ��� ��� ����. ��� ������ ��������� � ������ � ��������� ������ cartulary, ������ ��������� ������, � ��� �� ��� ����� �� ���������. 
//			for (int g = 0; g<name.length; g++) {
//				for (int k = 1; k<cartulary[0].length; k++) {
//					for (int i = 1; i<cartulary[0][k].length; i++) {
//					cartulary[g][k][i] = randomRating(rating);
//					Thread.sleep(7);
//					}
//				}
//			}		
//		}
			
		static void RatingFill (String [][][] cartulary) {
			for (int g = 0; g<name.length; g++) {
				for (int k = 1; k<cartulary[0].length; k++) {
					for (int i = 1; i<cartulary[0][k].length; i++) {
						if ( i == 1) {
						cartulary[g][k][i] = "1";
							}
						if ( i == 2) {
						cartulary[g][k][i] = "2";
							}
						if (i == 3) {
							cartulary[g][k][i] = "3";
							}
						if ( i == 4) {
							cartulary[g][k][i] = "4";
							}
						if ( i > 4) {
							cartulary[g][k][i] = "5";
							}
						}	
					}
				}
			}
		static String randomRating (String [] rating) {
			long timeRandom = System.currentTimeMillis();
			String timeRandomString = String.valueOf(timeRandom);
			for (int i = 1; i<lengthHours(subject); i++) {
				String toRating = timeRandomString.substring(timeRandomString.length()-i);
				int rating1 = (Integer.parseInt(toRating));
				String rezult = null;
				if (rating1>=0 && rating1<2) {
					rezult = rating[0];
				}
				if (rating1>=2 && rating1<3) {
					rezult = rating[1];
				}
				if (rating1>=3 && rating1<5) {
					rezult = rating[2];
				}
				if (rating1>=5 && rating1<7) {
					rezult = rating[3];
				}
				if (rating1>=7 && rating1<=9) {
					rezult = rating[4];
				}
				return rezult;
			}
			return "-1";
		}
		
		static void hoursLength (String [][][] cartulary) {
			for (int i = 0;i<name.length; i++) {
				for (int k = 0, j = 1; k<subject.length; k++, j++) {
					int length = new Integer(subject[k][1]);
					cartulary[i][j] = new String [length+1];
					if(i>name.length || k>subject.length) {
						break;
					}
				// ���� ���� ��� �������� ��������.
				}
			}
		}
			
		static String [][] indexName (String[][] name) {
			String [][] indexName = new String [name.length][name[0].length+1];
			for (int i = 0; i<name.length; i++) {
				indexName[i][0] = name[i][0];}
			for (int k = 0; k<name.length; k++) {
				indexName[k][1] = name[k][1];}
			for (int g = 0; g<name.length; g++) {
				indexName[g][2] = Integer.toString(g+1);}
			return indexName;
		}
			
		static int lengthHours (String [][] subject) {
			int [] maxlengthHours = new int [subject.length]; 
			for (int i = 0; i<subject.length; i++) {
				maxlengthHours[i] = new Integer (subject[i][1]);
			}
				for (int i = 0; i<maxlengthHours.length-1; i++) {
					if (maxlengthHours[i]<maxlengthHours[i+1]) {
						int mem = maxlengthHours[i];
						maxlengthHours[i] = maxlengthHours[i+1];
						maxlengthHours[i+1] = mem;
					}
				} 
				int maxHours = maxlengthHours[0];
				return maxHours;
				}
			

}