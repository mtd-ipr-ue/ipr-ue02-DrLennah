import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.print("Geben Sie Wert 1 ein: ");
        int wert1 = In.readInt();
        Out.print("Geben Sie Wert 2 ein: ");
        int wert2 = In.readInt();
        Out.print("Geben Sie Wert 3 ein: ");
        int wert3 = In.readInt();
        int max = wert1;
        
        if (wert1 > wert2) {
            max = wert1;
        } 
        if (wert2 > wert1) {
            max = wert2;
        } 
        if (wert3 > wert2) {
            max = wert3;
        }
        Out.print("Maximum: ");
        Out.println(max);
    }
}
