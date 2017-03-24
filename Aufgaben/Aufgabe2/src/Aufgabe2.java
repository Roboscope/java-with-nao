import java.util.Random;

/**
 * Abfragen:
 * Absoluter Wert
 */
public class Aufgabe2 {

    private static Random rng = new Random();

    public static void main(String[] args) {
        //Die folgende Zeile definiert x als eine Zufallszahl von -100 bis 100
        final int ZUFALL = rng.nextInt(201)-100;
        //Hier könnt ihr eure Lösung programmieren:

        //Die nächsten Zeilen geben euer Ergebnis in der Konsole aus
        System.out.println("Der absolute Wert von "+ZUFALL+" ist "+x+".");
        System.out.println("x > 50 ist eine " + (y ? "wahre" : "falsche") + " Aussage!");
    }
}
