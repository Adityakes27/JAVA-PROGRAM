
import java.util.Scanner;

public class RightArrowPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Upper Part
        for(int i = n; i >= 1; i--) {

            // Spaces
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Part
        for(int i = 2; i <= n; i++) {

            // Spaces
            for(int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }

            // Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}