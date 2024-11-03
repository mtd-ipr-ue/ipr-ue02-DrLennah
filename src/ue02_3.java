import java.util.Scanner;

//import libraries.In;
//import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die X-Koordinate ein: ");
        double x = scanner.nextDouble();

        System.out.print("Geben Sie die Y-Koordinate ein: ");
        double y = scanner.nextDouble();

        double radius = 4;

        if (x >= 0 && x <= 4 && y >= 0 && y <= 4 && (x * x + y * y <= radius * radius)) {
            System.out.println("Die Koordinate liegt innerhalb der Fläche");
        } else {
            System.out.println("Die Koordinate liegt außerhalb der Fläche.");
        }

        scanner.close();
    }
}
