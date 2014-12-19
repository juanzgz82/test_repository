import utils.Utils;

public class MyClass {
	public static void main (String[] args) {
		try {
			System.out.println("Hello World!");
		} catch (Exception e) {
			System.out.println(Utils.getStackTrace(e));
		}
	}
}