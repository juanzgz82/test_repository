import utils.Utils;

public class MyClass {
	final static String SALUDO_EN = "Hello World!";
	final static String ERROR_EN = "Error: ";
	
	public static void main (String[] args) {
		try {
			System.out.println(SALUDO_EN);
		} catch (Exception e) {
			System.out.println(ERROR_EN + Utils.getStackTrace(e));
		}
	}
}