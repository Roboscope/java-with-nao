import com.roboscope.javawithnao.NaoRhaegal;
import com.roboscope.javawithnao.SimpleInterface;

public class Main {
	
	private static SimpleInterface naoInterface = new SimpleInterface();
	private static NaoRhaegal nao = naoInterface.connectToRhaegal();

	public static void main(String[] args) {
		int i = 1;
		int x = 2;
		int y = 8;
		while (i > 0) {
			nao.say("I ist " + i);
			i = y - x;
			x = x + 1;
		}
	}

}