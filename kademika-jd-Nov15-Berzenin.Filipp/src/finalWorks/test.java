package finalWorks;

public class test {

	public static void main(String[] args) {
		double x = 0.9895;
		int roundingAfterPoint = 2;
		String k = null;
		String xString = Double.toString(x);
		for (int i = xString.length() - 1; i > 1 + roundingAfterPoint; i--) {
			String xSt = Double.toString(x);
//			if (i == xString.length()) {
//				k = xString.substring(i);
//			} else {
				k = xSt.substring(i);
//			}
			double v = new Double(k);
			if (v >= 5) {
				double r = 1;
				r = r / Math.pow(10, i - 2);
				x += r;
				System.out.println(r+"r");
				System.out.println(x);
//				v = 0;
			}
			System.out.println(i+"i");
			xSt = xSt.substring(0,i);
			x = new Double (xSt);
			System.out.println(x);
		}
		xString = Double.toString(x);
		xString = xString.substring(0, roundingAfterPoint+2);
		System.out.println(xString);
	}

}
