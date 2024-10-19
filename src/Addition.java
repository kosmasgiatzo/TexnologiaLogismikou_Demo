import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // Δημιουργία scanner για την εισαγωγή αριθμών από τον χρήστη
        Scanner scanner = new Scanner(System.in);

        // Ζητάμε από τον χρήστη να εισάγει δύο αριθμούς
        System.out.print("Εισάγετε τον πρώτο αριθμό: ");
        int num1 = scanner.nextInt();

        System.out.print("Εισάγετε τον δεύτερο αριθμό: ");
        int num2 = scanner.nextInt();

        // Προσθέτουμε τους δύο αριθμούς
        int sum = num1 + num2;

        // Εκτύπωση του αποτελέσματος
        System.out.println("Το άθροισμα είναι: " + sum);
    }
}
