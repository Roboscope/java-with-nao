import com.roboscope.javawithnao.NaoRhaegal;
import com.roboscope.javawithnao.SimpleInterface;

public class Main {
	
	private static SimpleInterface naoInterface = new SimpleInterface();
	private static NaoRhaegal nao = naoInterface.connectToRhaegal();

	public static boolean isDividable(int x, int y) {
		while (x > 0) {
			x = x - y;
		}
		return (x == 0);
	}
	
	public static boolean isPrime(int x) {
		for (int i = 2; i < x; i++) {
			if (isDividable(x, i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		if (isPrime(3)) {
			nao.say("3 ist eine Primzahl!");
		} else {
			nao.say("3 ist keine Primzahl!");
		}
		if (isPrime(16)) {
			nao.say("16 ist eine Primzahl!");
		} else {
			nao.say("16 ist keine Primzahl!");
		}
	}

}