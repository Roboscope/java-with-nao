import com.roboscope.javawithnao.NaoRhaegal;
import com.roboscope.javawithnao.SimpleInterface;

public class Main {
	
	private static SimpleInterface naoInterface = new SimpleInterface();
	private static NaoRhaegal nao = naoInterface.connectToRhaegal();

	public static void main(String[] args) {
		do {
			nao.say("Werde ich diesen Satz sagen?");
		} while (false);
	}

}