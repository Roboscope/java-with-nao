import java.util.Random;

/**
 * Schleifen:
 * Manuelle Multiplikation
 */
public class Aufgabe3 {

    private static Random rng = new Random();

    public static void main(String[] args) {
        //Zuerst definieren wir zwei Variablen mit zufälligen Werten
        final int X = rng.nextInt(30);
        final int Y = rng.nextInt(30);
        int produktA = 0;
        int produktB = 0;
        int produktC = 0;
        //Hier könnt ihr eure Lösungen programmieren:

        //Die nächsten Zeilen geben wieder eure Ergebnisse aus
        System.out.println(X + "*" + Y + "=" + produktA);
        System.out.println(X + "*" + Y + "=" + produktB);
        System.out.println(X + "*" + Y + "=" + produktC);
    }
}
