import java.util.Arrays;

public class test {

	public static void main(String[] args) {

		String[] arraySell = new String[] {"1", "2", "3"};
		
		String[] arraySellRegister = new String [3];

		System.arraycopy(arraySell, 0, arraySellRegister, 0, arraySell.length);
		
		System.out.println(Arrays.toString(arraySellRegister));

	}
}