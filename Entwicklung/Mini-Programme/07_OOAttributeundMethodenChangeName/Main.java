import com.roboscope.javawithnao.NaoRhaegal;
import com.roboscope.javawithnao.SimpleInterface;

public class Main {

	public static void main(String[] args) {
		Nao rhaegal = new Nao();
		rhaegal.name = "Jack";
		rhaegal.sayYourName();
		rhaegal.changeName("Rhaegal");
		rhaegal.sayYourName();
	}

}