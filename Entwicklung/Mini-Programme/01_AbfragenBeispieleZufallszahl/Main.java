import com.roboscope.javawithnao.NaoRhaegal;
import com.roboscope.javawithnao.SimpleInterface;
import java.util.Random;

public class Main {
	
	private static SimpleInterface naoInterface = new SimpleInterface();
	private static final Random RNG = new Random();
	private static final int ZUFAELLIGE_ZAHL_VON_0_BIS_9 = RNG.nextInt(10);
	private static NaoRhaegal nao = naoInterface.connectToRhaegal();

	public static void main(String[] args) {
		if (ZUFAELLIGE_ZAHL_VON_0_BIS_9 > 4) {
			nao.say("Die Zahl ist groesser als 4");
		} else {
			nao.say("Die Zahl ist kleiner als 5");
		}
		System.out.println(String.valueOf(ZUFAELLIGE_ZAHL_VON_0_BIS_9));
	}

}