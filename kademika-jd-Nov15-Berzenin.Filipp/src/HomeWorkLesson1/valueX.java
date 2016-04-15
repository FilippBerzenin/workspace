package HomeWorkLesson1;

public class valueX {

	public static void main(String[] args) {
		 double value = 25.6;
	        String x = String.valueOf(value);
	        System.out.println(x.substring(0, x.indexOf(".")));
	        System.out.println(x.substring(x.indexOf(".")+1));

	}

}
