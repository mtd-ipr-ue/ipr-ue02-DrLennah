import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.println("Geben Sie Ihr Jahr ein: ");
        int jahr = In.readInt();
        Out.println("Geben Sie Ihren Monat ein: ");
        int monat = In.readInt();

        int tage = -1;
        switch (monat) {
            case 1, 3, 5, 7, 8, 10, 12:
                tage = 31;
                break;

            case 4, 6, 9, 11:
                tage = 30;
                break;

            case 2:
                if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
                    tage = 29;
                } else {
                    tage = 28;
                }
                break;

            default:
                Out.println("Fehler: ungültiger Monat");
                return;
        }
        Out.println("Anzahl der Tage: " + tage);
    }
}
