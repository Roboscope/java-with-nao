import com.roboscope.javawithnao.NaoRhaegal;
import com.roboscope.javawithnao.SimpleInterface;

public class Main {

	public static void main(String[] args) {
		Nao nao = new Nao();
		nao.name = "Sam";
		String naosName = nao.getName();
		nao.sayYourName();
		nao.changeName(naosName + "antha");
		nao.sayYourName();
	}

}