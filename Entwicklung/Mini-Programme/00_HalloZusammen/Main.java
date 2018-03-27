import com.roboscope.javawithnao.NaoRhaegal;
import com.roboscope.javawithnao.SimpleInterface;

public class Main {
	
	private static SimpleInterface naoInterface = new SimpleInterface();

	public static void main(String[] args) {
		NaoRhaegal nao = naoInterface.connectToRhaegal();
		nao.say("Hallo zusammen!");
	}

}