import com.roboscope.javawithnao.NaoRhaegal;
import com.roboscope.javawithnao.SimpleInterface;

public class Nao {
	
	private static SimpleInterface naoInterface = new SimpleInterface();
	private static NaoRhaegal nao = naoInterface.connectToRhaegal();

	public String name;

    public void sayYourName() {
        nao.say("Mein Name ist " + name);
    }

}