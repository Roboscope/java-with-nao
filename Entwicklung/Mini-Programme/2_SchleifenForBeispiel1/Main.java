import com.roboscope.javawithnao.NaoRhaegal;
import com.roboscope.javawithnao.SimpleInterface;

public class Main {
	
	private static SimpleInterface naoInterface = new SimpleInterface();
	private static NaoRhaegal nao = naoInterface.connectToRhaegal();

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i = i + 1) {
			nao.say("I ist " + i);
		}
	}

}