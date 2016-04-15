package finalWorks;

public class examen_1 {

	public static void main(String[] args) {

		String str =  "ygiug Fil sfs afs ad Fil fas fsaf Fil";
		String name = "Fil";
		int number = 0;
		int k = 0;
//		System.out.println(str.length());
		for (int i = 0; i<(str.length()/name.length());i++) {
				int begin = str.indexOf(name,k);
				k = begin+1;
				number+=1;
//				System.out.println(k);
				if (k>str.length()-name.length()) {
					break;
				}
				}
			
		System.out.println(number);
		}

	}


