import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for(int block = 0; block < n; block++) {

            for(int row = 1; row <= n; row++) {

                // Print leading spaces
                for(int space = 0; space < block; space++) {
                    System.out.print(" ");
                }

                // Print stars
                for(int star = 1; star <= row; star++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}
