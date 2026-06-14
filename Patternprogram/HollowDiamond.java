import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        // Upper Half
        for(int i = 1; i <= n; i++) {

            // Left Stars
            for(int j = i; j <= n; j++) {
                System.out.print("*");
            }

            // Middle Spaces
            for(int j = 1; j <= 2 * i - 2; j++) {
                System.out.print(" ");
            }

            // Right Stars
            for(int j = i; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for(int i = n - 1; i >= 1; i--) {

            // Left Stars
            for(int j = i; j <= n; j++) {
                System.out.print("*");
            }

            // Middle Spaces
            for(int j = 1; j <= 2 * i - 2; j++) {
                System.out.print(" ");
            }

            // Right Stars
            for(int j = i; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}