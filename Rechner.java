import java.util.Scanner;

/**
 * Ein Taschenrechner
 * 
 * @author Malte Nagel, Prof. Dr.-Ing. Emre Cakar
 */
public class Rechner
{

    /*
     * Die main-Methode. Gibt "Hallo Welt!" aus.
     */
    public static void main(String[] args)
    {
        // Einrichtung
        int a, b, result = 0;
        String op;
        JConsole console = new JConsole();
        
        Operator add = (x, y) -> x + y;
        Operator sub = (x, y) -> x - y;
        
        while (true) {
            // Eingabe
            do {
                op = console.readString("Welche Operation soll durchgeführt werden (+,-)?: ");
            } while(!op.equals("+") && !op.equals("-"));
            
            a = console.readInt("Erste Ganzzahl: ");
            b = console.readInt("Zweite Ganzzahl: ");
            
            // Verarbeitung
            if (op.equals("+")) {
                result = add.calculate(a, b);
            } else if (op.equals("-")) {
                result = sub.calculate(a, b);
            }
            
            // Ausgabe
            console.println("Ergebnis: " + result);
        }
    }

}
