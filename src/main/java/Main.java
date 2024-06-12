import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wysokość choinki: ");
        int height = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            // Spacje przed gwiazdkami
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // Gwiazdki tworzące choinkę
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            // Przejście do nowej linii
            System.out.println();
        }
        // Podstawa choinki
        for (int i = 0; i < (height / 2)+height/2-1; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}