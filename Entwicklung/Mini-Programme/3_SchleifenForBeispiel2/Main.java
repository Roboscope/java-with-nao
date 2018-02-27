import com.roboscope.javawithnao.NaoRhaegal;
import com.roboscope.javawithnao.SimpleInterface;

public class Main {
	
	private static SimpleInterface naoInterface = new SimpleInterface();
	private static NaoRhaegal nao = naoInterface.connectToRhaegal();

	public static void main(String[] args) {
		boolean weitermachen = true;
		for (int i = 1; weitermachen; i = i + 1) {
			nao.say("I ist " + i);
			if (i == 10) {
				weitermachen = false;
			}
		}
	}

}