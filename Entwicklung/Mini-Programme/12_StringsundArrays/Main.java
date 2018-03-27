import com.roboscope.javawithnao.NaoRhaegal;
import com.roboscope.javawithnao.SimpleInterface;

public class Main {
	
	private static SimpleInterface naoInterface = new SimpleInterface();
	private static NaoRhaegal nao = naoInterface.connectToRhaegal();

	public static void main(String[] args) {
		int[] x = new int[2];
		x[0] = 7;
		x[1] = 5;
		String[] y = {"Eins", "Zwei", "Drei", "Vier"};
		nao.say((x[0] + x[1]) + y[2] + y.length);
	}


}