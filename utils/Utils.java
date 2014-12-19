import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Utils {
	public static String getStackTrace(Throwable aThrowable) {
		Writer result = new StringWriter();
		PrintWriter printWriter = new PrintWriter(result);
		aThrowable.printStackTrace(printWriter);
		return result.toString();
	}
}