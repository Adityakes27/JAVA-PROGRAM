public class AlphabetPattern {
    public static void main(String[] args) {

        int n = 6;

        for (int i = n; i >= 1; i--) {

            // Left Part
            for (int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j - 1));
            }

            // Middle Spaces
            int spaces = 2 * (n - i);

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right Part
            for (int j = i; j >= 1; j--) {
                System.out.print((char)('A' + j - 1));
            }

            System.out.println();
        }
    }
}
