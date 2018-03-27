import com.roboscope.javawithnao.NaoRhaegal;
import com.roboscope.javawithnao.SimpleInterface;

public class Main {

	public static void main(String[] args) {
		Nao rhaegal = new Nao();
		Nao viserion = new Nao();
		rhaegal.name = "Rhaegal";
		viserion.name = "Viserion";
		rhaegal.sayYourName();
	}

}